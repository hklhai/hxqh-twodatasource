package com.hxqh.twodatasource.repository.second;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the v_ffm_achievement database table.
 */
@Entity
@Table(name = "v_ffm_achievement")
public class VFfmAchievement implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private VFfmAchievementKey vFfmAchievementKey;

    public VFfmAchievement() {
    }

    public VFfmAchievementKey getvFfmAchievementKey() {
        return vFfmAchievementKey;
    }

    public void setvFfmAchievementKey(VFfmAchievementKey vFfmAchievementKey) {
        this.vFfmAchievementKey = vFfmAchievementKey;
    }
}