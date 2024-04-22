package com.pedro.sphynx.domain;

import com.pedro.sphynx.application.dtos.message.MessageDTO;
import org.springframework.stereotype.Service;

import java.util.ResourceBundle;

@Service
public class MessageService {
    public MessageDTO createMessage(int status, Object object, String language){
        ResourceBundle messages = ResourceBundle.getBundle("messagesEn");

        if(language.equals("pt-BR")){
            messages = ResourceBundle.getBundle("messagesPt");
        }
        else if(language.equals("en-US")){
            messages = ResourceBundle.getBundle("messagesEn");
        }

        return new MessageDTO(status, messages.getString("success." + status), object);
    }
}