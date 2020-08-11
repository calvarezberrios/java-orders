package com.lambdaschool.modelingorders.services;

import com.lambdaschool.modelingorders.models.Agent;
import com.lambdaschool.modelingorders.repositories.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service(value = "agentService")
public class AgentServicesImpl implements AgentServices
{
    @Autowired
    AgentRepository agentrepo;

    @Transactional
    @Override
    public Agent save(Agent agent)
    {
        return agentrepo.save(agent);
    }
}
