import java.util.*;

/******************************************************************************
 *  Writer:       Noakai Aronesty
 *  Compilation:  javac Invitation.java
 *  Execution:    java Invitation
 ******************************************************************************/

public class Invitation
{
    private String hostName;
    private String address;

    public Invitation(String n, String a)
    {
        hostName = n;
        address = a;
    }

    public Invitation(String address)
    {
        this.address = address;
        hostName = "Host";
    }

    public String retHostName() {
        return hostName;
    }

    public void updateAddress(String newAd) {
        address = newAd;
    }

    public String invite(String invitee) {
        return "Dear " + invitee + ", please attend my event at " + address + ". See you then, " + hostName + ".";
    }
}
