package org.openpaas.paasta.portal.api.model;

import java.util.UUID;

/**
 * Web Ide 모델
 *
 * @author nawkm
 * @version 1.0
 * @since 2016.8.30 최초작성
 */
public class BuildPack {
    private UUID guid;
    private String name;
    private int position;
    private boolean enable;
    private boolean lock;

    public UUID getGuid() {
        return guid;
    }

    public void setGuid(UUID guid) {
        this.guid = guid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public boolean getEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public boolean getLock() {
        return lock;
    }

    public void setLock(boolean lock) {
        this.lock = lock;
    }
}
