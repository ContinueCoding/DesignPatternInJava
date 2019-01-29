package com.huoxy.c1_chain_of_responsibility_14.example1;

/**
 * 请假实体类
 */
public class Request {
    private int id;
    private String name;
    private int days;
    private String reason;
    private String leaderInfo;
    private String managerInfo;
    private String ceoInfo;
    private String customInfo;

    public Request(Builder builder){
        super();
        this.id = builder.id;
        this.name = builder.name;
        this.days = builder.days;
        this.reason = builder.reason;
        this.leaderInfo = builder.leaderInfo;
        this.managerInfo = builder.managerInfo;
        this.ceoInfo = builder.ceoInfo;
        this.customInfo = builder.customInfo;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDays() {
        return days;
    }

    public String getReason() {
        return reason;
    }

    public String getLeaderInfo() {
        return leaderInfo;
    }

    public String getManagerInfo() {
        return managerInfo;
    }

    public String getCeoInfo() {
        return ceoInfo;
    }

    public String getCustomInfo() {
        return customInfo;
    }

    @Override
    public String toString() {
        return "Request{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", days=" + days +
                ", reason='" + reason + '\'' +
                ", leaderInfo='" + leaderInfo + '\'' +
                ", managerInfo='" + managerInfo + '\'' +
                ", ceoInfo='" + ceoInfo + '\'' +
                ", customInfo='" + customInfo + '\'' +
                '}';
    }

    //=======================Builder========================

    public static class Builder{

        public int id;
        public String name;
        public int days;
        public String reason;
        public String leaderInfo;
        public String managerInfo;
        public String ceoInfo;
        public String customInfo;

        public Builder(){

        }

        public Builder id(int id){
            this.id = id;
            return this;
        }

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder days(int days){
            this.days = days;
            return this;
        }

        public Builder reason(String reason){
            this.reason = reason;
            return this;
        }

        public Builder leaderInfo(String leaderInfo){
            this.leaderInfo = leaderInfo;
            return this;
        }

        public Builder managerInfo(String managerInfo){
            this.managerInfo = managerInfo;
            return this;
        }

        public Builder ceoInfo(String ceoInfo){
            this.ceoInfo = ceoInfo;
            return this;
        }

        public Builder customInfo(String customInfo){
            this.customInfo = customInfo;
            return this;
        }

        public Builder newRequest(Request request) {
            this.id = request.id;
            this.name = request.name;
            this.days = request.days;
            this.reason = request.reason;
            this.leaderInfo = request.leaderInfo;
            this.managerInfo = request.managerInfo;
            this.ceoInfo = request.ceoInfo;
            this.customInfo = request.customInfo;
            return this;
        }

        public Request build(){
            return new Request(this);
        }
    }
}
