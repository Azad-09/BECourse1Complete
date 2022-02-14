package org.example;

public class customer {
    private int cid;
    private String cname;
    private address details;
    private  product proDetails;

    public customer(int cid, String cname,address details, product proDetails) {
        this.cid = cid;
        this.cname = cname;
        this.details = details;
        this.proDetails = proDetails;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "customer{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", details=" + details +
                ", proDetails=" + proDetails +
                '}';
    }
}
