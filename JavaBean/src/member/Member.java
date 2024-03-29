package member;

import java.sql.Date;

public class Member {

    private Integer MemNo;
    private String MName;
    private String MemAcc;
    private String MemPwd;
    private Integer MemMob;
    private Integer MGender;
    private String MemMail;
    private String MemAdd;
    private Double MemBd;
    private String MemCard;
    private Integer Provider;
    private String ClientID;
    private String DisplayName;
    private String AccessToken;
    private String RefreshToken;
    private Date TknExpireTime;
    private Date CreationTime;
    private Date MemberJoinTime;
    private Integer MemStat;

    public Integer getMemNo() {
        return MemNo;
    }

    public void setMemNo(Integer memNo) {
        MemNo = memNo;
    }

    public String getMName() {
        return MName;
    }

    public void setMName(String MName) {
        this.MName = MName;
    }

    public String getMemAcc() {
        return MemAcc;
    }

    public void setMemAcc(String memAcc) {
        MemAcc = memAcc;
    }

    public String getMemPwd() {
        return MemPwd;
    }

    public void setMemPwd(String memPwd) {
        MemPwd = memPwd;
    }

    public Integer getMemMob() {
        return MemMob;
    }

    public void setMemMob(Integer memMob) {
        MemMob = memMob;
    }

    public Integer getMGender() {
        return MGender;
    }

    public void setMGender(Integer MGender) {
        this.MGender = MGender;
    }

    public String getMemMail() {
        return MemMail;
    }

    public void setMemMail(String memMail) {
        MemMail = memMail;
    }

    public String getMemAdd() {
        return MemAdd;
    }

    public void setMemAdd(String memAdd) {
        MemAdd = memAdd;
    }

    public Double getMemBd() {
        return MemBd;
    }

    public void setMemBd(Double memBd) {
        MemBd = memBd;
    }

    public String getMemCard() {
        return MemCard;
    }

    public void setMemCard(String memCard) {
        MemCard = memCard;
    }

    public Integer getProvider() {
        return Provider;
    }

    public void setProvider(Integer provider) {
        Provider = provider;
    }

    public String getClientID() {
        return ClientID;
    }

    public void setClientID(String clientID) {
        ClientID = clientID;
    }

    public String getDisplayName() {
        return DisplayName;
    }

    public void setDisplayName(String displayName) {
        DisplayName = displayName;
    }

    public String getAccessToken() {
        return AccessToken;
    }

    public void setAccessToken(String accessToken) {
        AccessToken = accessToken;
    }

    public String getRefreshToken() {
        return RefreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        RefreshToken = refreshToken;
    }

    public Date getTknExpireTime() {
        return TknExpireTime;
    }

    public void setTknExpireTime(Date tknExpireTime) {
        TknExpireTime = tknExpireTime;
    }

    public Date getCreationTime() {
        return CreationTime;
    }

    public void setCreationTime(Date creationTime) {
        CreationTime = creationTime;
    }

    public Date getMemberJoinTime() {
        return MemberJoinTime;
    }

    public void setMemberJoinTime(Date memberJoinTime) {
        MemberJoinTime = memberJoinTime;
    }

    public Integer getMemStat() {
        return MemStat;
    }

    public void setMemStat(Integer memStat) {
        MemStat = memStat;
    }
}
