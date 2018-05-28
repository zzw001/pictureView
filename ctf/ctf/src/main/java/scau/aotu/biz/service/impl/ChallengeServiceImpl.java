package scau.aotu.biz.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scau.aotu.biz.dao.ChallengeMapper;
import scau.aotu.biz.model.Challenge;
import scau.aotu.biz.service.ChallengeService;

@Service
public class ChallengeServiceImpl implements ChallengeService {

    @Autowired
    private ChallengeMapper challengeMapper;

    @Override
    public int add(Challenge challenge) {
        return challengeMapper.insert(challenge);
    }
}
