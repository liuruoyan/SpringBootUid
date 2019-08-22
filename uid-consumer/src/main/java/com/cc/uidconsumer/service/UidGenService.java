package com.cc.uidconsumer.service;


import com.baidu.fsg.uid.UidGenerator;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UidGenService {

    @Resource
    private UidGenerator uidGenerator;

    public long getUid() {
        long uid = uidGenerator.getUID();
        System.out.println("uid=" + uid);
        System.out.println("parseUid = " + uidGenerator.parseUID(uid));
        return uid;
    }
}
