package com.planet_ink.coffee_mud.interfaces;
import java.util.*;

public interface PlayerStats
{
	public static final String defaultPrompt="^N<^c%hhp %mm %vmv^N>";
	public String getEmail();
	public void setEmail(String newAdd);
	/** When the USER last logged off */
	public long lastDateTime();
	public long lastUpdated();
	public void setLastDateTime(long C);
	public void setUpdated(long time);
	/** User PASSWORD */
	public String password();
	public void setPassword(String newPassword);
	public void setChannelMask(int newMask);
	public int getChannelMask();
	public String getColorStr();
	public void setColorStr(String color);
	public String getPrompt();
	public void setPrompt(String prompt);
	public HashSet getFriends();
	public HashSet getIgnored();
	public String poofIn();
	public String poofOut();
	public String tranPoofIn();
	public String tranPoofOut();
	public void setPoofs(String poofIn, String poofOut, String tranPoofIn, String tranPoofOut);
	public String getXML();
	public void setXML(String str);
	public String lastIP();
	public void setLastIP(String ip);
	public void setReplyTo(MOB mob);
	public MOB replyTo();
	public Vector getSecurityGroups();
}
