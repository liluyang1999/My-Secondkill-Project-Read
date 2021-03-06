package com.example.lly.entity;

import com.example.lly.util.BaseUtil;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serial;
import java.io.Serializable;
import java.sql.Timestamp;

@IdClass(OrderInfoPK.class)
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "t_orderinfo")
public class OrderInfo implements Serializable {

    @Id
    @NotNull
    @Column(name = "seckillinfo_id")
    private Integer seckillInfoId;     //秒杀活动的Id

    @Id
    @NotNull
    @Column(name = "user_id")
    private Integer userId;        //秒杀用户的Id

    @Column(name = "state")
    private Short state;            //活动状态

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "order_time")
    private Timestamp orderTime;    //订单创建时间，与数据库交互尽量用TimeStamp

    public Integer getSeckillInfoId() {
        return seckillInfoId;
    }

    public void setSeckillInfoId(Integer seckillInfoId) {
        this.seckillInfoId = seckillInfoId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }

    public Timestamp getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Timestamp orderTime) {
        this.orderTime = orderTime;
    }

    @Override
    public String toString() {
        return "OrderInfo{" +
                "orderTime=" + orderTime +
                ", seckillId=" + seckillInfoId +
                ", userId='" + userId +
                ", state=" + state +
                '}';
    }

    @Serial
    private static final long serialVersionUID = BaseUtil.SERIAL_VERSION_UID;

}

