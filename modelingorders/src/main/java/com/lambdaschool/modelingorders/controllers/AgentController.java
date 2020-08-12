package com.lambdaschool.modelingorders.controllers;

import com.lambdaschool.modelingorders.models.Agent;
import com.lambdaschool.modelingorders.services.AgentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/agents")
public class AgentController
{
    @Autowired
    AgentServices agentService;

//    http://localhost:2019/agents/agent/9
    @GetMapping(value = "/agent/{agentid}", produces = {"application/json"})
    public ResponseEntity<?> getAgentById(@PathVariable long agentid)
    {
        Agent agent = agentService.findById(agentid);
        return new ResponseEntity<>(agent, HttpStatus.OK);
    }
}
