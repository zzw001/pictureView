using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Drawing.Imaging;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace PictureView
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            
        }

        private void pictureBox1_Click(object sender, EventArgs e)
        {

        }

        private int begin_x;      
        private int begin_y;


        private Image image_ori;
        private float zoom;           

        private Point m_StarPoint = Point.Empty;      
        private Point m_ViewPoint = Point.Empty;

        int w;                      
        int h;

        private void button3_Click(object sender, EventArgs e)
        {
            OpenFileDialog openFileDlg = new OpenFileDialog();
            openFileDlg.Filter = "*.jpg|*.jpg;*.jpeg";
            if (openFileDlg.ShowDialog() == DialogResult.OK)
            {
                image_ori = Image.FromFile(openFileDlg.FileName);
                begin_x = 0;
                begin_y = 0;
                zoom = 100;
                zoom_image(false);
            }
            openFileDlg.Dispose();
        }

        private void zoom_image(bool chec)
        {
            w = Convert.ToInt32(image_ori.Width * zoom / 100);
            h = Convert.ToInt32(image_ori.Height * zoom / 100);
            if (w < 1 || h < 1) return;
            if (chec)
            {
                if (begin_x + pictureBox1.Width > w) begin_x = w - pictureBox1.Width;
                if (begin_y + pictureBox1.Height > h) begin_y = h - pictureBox1.Height;
                if (begin_x < 0) begin_x = 0;
                if (begin_y < 0) begin_y = 0;
            }
            Bitmap resizedBmp = new Bitmap(w, h);
            Graphics g = Graphics.FromImage(resizedBmp);
            g.InterpolationMode = System.Drawing.Drawing2D.InterpolationMode.NearestNeighbor;
            g.SmoothingMode = System.Drawing.Drawing2D.SmoothingMode.None;
            g.DrawImage(image_ori, new Rectangle(0, 0, w, h), new Rectangle(0, 0, image_ori.Width, image_ori.Height), GraphicsUnit.Pixel);

            int ww, hh;
            ww = w;
            hh = h;
            if (pictureBox1.Width < ww) ww = pictureBox1.Width;
            if (pictureBox1.Height < hh) hh = pictureBox1.Height;
            try
            {
                pictureBox1.Image = resizedBmp.Clone(new RectangleF((float)begin_x, (float)begin_y, ww, hh), PixelFormat.Format24bppRgb);  
            }
            catch
            {

            }
            g.Dispose();
        }

        


        private void checkBox1_CheckedChanged(object sender, EventArgs e)
        {
            if (checkBox1.Checked)
                pictureBox1.SizeMode = PictureBoxSizeMode.StretchImage;
            else
                pictureBox1.SizeMode = PictureBoxSizeMode.Normal;
        }

        private void btnOpen_Click(object sender, EventArgs e)
        {
            
            if (openFileDialog1.ShowDialog() == DialogResult.OK)
            {
                image_ori = Image.FromFile(openFileDialog1.FileName);
                begin_x = 0;
                begin_y = 0;
                zoom = 100;
                zoom_image(false);
            }

        }

        private void btnClose_Click(object sender, EventArgs e)
        {
            pictureBox1.Image = null;
        }

        private void closeButton_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void btnZoomIn_Click(object sender, EventArgs e)
        {
            if (pictureBox1.Image == null)
            {
                return;
            }
            float min = pictureBox1.Width / image_ori.Width;
            float min_y = pictureBox1.Height / image_ori.Height;
            if (min < min_y) min = min_y;
            else min = min_y;

            zoom += 10;
            if (zoom > 200) zoom = 200;
            zoom_image(true);
        }

        private void btnZoonOut_Click(object sender, EventArgs e)
        {
            if (pictureBox1.Image == null)
            {
                return;
            }
            float min = pictureBox1.Width / image_ori.Width;
            float min_y = pictureBox1.Height / image_ori.Height;
            if (min < min_y) min = min_y;
            else min = min_y;

            zoom -= 10;
            if (zoom < min) zoom = min;
            zoom_image(true);
        }

        private void btnClockwiseRotate_Click(object sender, EventArgs e)
        {
            if (pictureBox1.Image == null)
            {
                return;
            }
            Image image = pictureBox1.Image;
            image.RotateFlip(RotateFlipType.Rotate90FlipNone);
            image_ori = image;
            begin_x = 0;
            begin_y = 0;
            zoom = 100;
            zoom_image(false);
        }

        private void btnPre_Click(object sender, EventArgs e)
        {
            if (pictureBox1.Image == null)
            {
                return;
            }
            string[] path = Directory.GetFiles(openFileDialog1.FileName.Substring(0, openFileDialog1.FileName.LastIndexOf("\\") + 1));
            for (int i = 0; i < path.Length; i++)
            {
                if (path[i] == openFileDialog1.FileName)
                {
                    i = i - 1;
                    if (i < 0)
                    {
                        i = path.Length-1;
                    }
                    openFileDialog1.FileName = path[i];
                    image_ori = Image.FromFile(path[i]);
                    begin_x = 0;
                    begin_y = 0;
                    zoom = 100;
                    zoom_image(false);
                    return;
                }

            }
        }

        private void btnNext_Click(object sender, EventArgs e)
        {
            if (pictureBox1.Image == null)
            {
                return;
            }
            string[] path = Directory.GetFiles(openFileDialog1.FileName.Substring(0, openFileDialog1.FileName.LastIndexOf("\\")+1));
            for(int i = 0; i < path.Length; i++)
            {
                if (path[i] ==openFileDialog1.FileName)
                {
                    i=i+1;
                    if (i > path.Length - 1)
                    {
                        i = 0;
                    }
                    openFileDialog1.FileName = path[i];
                    image_ori = Image.FromFile(path[i]);
                    begin_x = 0;
                    begin_y = 0;
                    zoom = 100;
                    zoom_image(false);
                    return;
                }
                
            }
            
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (pictureBox1.Image == null)
            {
                return;
            }
            if (timer1.Enabled == true)
            {
                timer1.Enabled = false;
                button1.Text = "播放幻灯片";
            }
            else
            {
                timer1.Enabled = true;
                button1.Text = "暂停播放";
            }
        }

        private void btncounterclockwiseRotate_Click(object sender, EventArgs e)
        {
            if (pictureBox1.Image == null)
            {
                return;
            }
            Image image = pictureBox1.Image;
            image.RotateFlip(RotateFlipType.Rotate270FlipNone);
            image_ori = image;
            begin_x = 0;
            begin_y = 0;
            zoom = 100;
            zoom_image(false);
        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            if (pictureBox1.Image == null)
            {
                return;
            }
            string[] path = Directory.GetFiles(openFileDialog1.FileName.Substring(0, openFileDialog1.FileName.LastIndexOf("\\") + 1));
            for (int i = 0; i < path.Length; i++)
            {
                if (path[i] == openFileDialog1.FileName)
                {
                    i = i + 1;
                    if (i > path.Length - 1)
                    {
                        i = 0;
                    }
                    openFileDialog1.FileName = path[i];
                    image_ori = Image.FromFile(path[i]);
                    begin_x = 0;
                    begin_y = 0;
                    zoom = 100;
                    zoom_image(false);
                }
            }
        }
    }
}
