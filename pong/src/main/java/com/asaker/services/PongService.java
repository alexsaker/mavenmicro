/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asaker.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;

/**
 *
 * @author Alex
 */
@Path("pong")
public class PongService {
    @GET
    public void ping(@Suspended AsyncResponse response){
        response.resume("pong");
    }
}
