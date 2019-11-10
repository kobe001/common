package com.hongfa.module.netty;

import java.io.Serializable;
import java.util.Date;

public interface NettyHeader extends Serializable{

	public String getVersion();
	public String getRequestType();
	public void setRequestType(String requestType);
	public String getCommandType();
	public void setCommandType(String commandType);
	public String getGameServerType();
	public void setGameServerType(String gameServerType);
	public String getSource();
	public void setSource(String source);
	public String getSourceModule();
	public void setSourceModule(String sourceModule);
	public String getTarget();
	public void setTarget(String target);
	public String getTargetModule();
	public void setTargetModule(String targetModule);
	public String getCommandId();
	public void setCommandId(String commandId);
	public int getReturnCode();
	public void setReturnCode(int returnCode);
	public boolean needsReturn();
	public void setNeedsReturn(boolean needs);
	public Date getSendTime();
	public void setSendTime(Date sendTime);
}
