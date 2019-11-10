package com.hongfa.common.module;

import java.util.Date;

/**
 * @see 通讯头
 */
public class NettyHeaderBasis implements NettyHeader {
	private static final long serialVersionUID = -5166940707026399164L;

	private String version = "1.0";  //netty通信协议版本号
	private String requestType;      //请求类型,注册时请使用REGISTER
	private String commandType;      //命令类型
	private String gameServerType;   //游戏类型
	private String source;           //命令源,如包网的是用SITE, gameServer的使用GAMESERVER，操盘使用AP
	private String sourceModule;     //命令源模块编码,如AG使用AG,登录前台使用RECP,快乐十分使用KLC,时时彩SSC
	private String target;           //命令目标,同source,命令的达到处理方
	private String targetModule;     //命令目标模块编码,同sourceModule
	private String commandId;        //命令ID,此次命令唯一标识
	private int returnCode;          //命令相应code. 正常为0
	private boolean needsReturn;     //是否需要返回相应
	private Date sendTime;           //命令发送时间

	@Override
	public String getRequestType() {
		return requestType;
	}

	@Override
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	@Override
	public String getCommandType() {
		return commandType;
	}

	@Override
	public void setCommandType(String commandType) {
		this.commandType = commandType;
	}

	@Override
	public String getGameServerType() {
		return gameServerType;
	}

	@Override
	public void setGameServerType(String gameServerType) {
		this.gameServerType = gameServerType;
	}

	@Override
	public String getSource() {
		return source;
	}

	@Override
	public void setSource(String source) {
		this.source = source;
	}

	@Override
	public String getSourceModule() {
		return sourceModule;
	}

	@Override
	public void setSourceModule(String sourceModule) {
		this.sourceModule = sourceModule;
	}

	@Override
	public String getTarget() {
		return target;
	}

	@Override
	public void setTarget(String target) {
		this.target = target;
	}

	@Override
	public String getTargetModule() {
		return targetModule;
	}

	@Override
	public void setTargetModule(String targetModule) {
		this.targetModule = targetModule;
	}

	@Override
	public String getCommandId() {
		return commandId;
	}

	@Override
	public void setCommandId(String commandId) {
		this.commandId = commandId;
	}

	@Override
	public String getVersion() {
		return version;
	}

	@Override
	public int getReturnCode() {
		return returnCode;
	}

	@Override
	public void setReturnCode(int returnCode) {
		this.returnCode = returnCode;
	}

	@Override
	public boolean needsReturn() {
		return needsReturn;
	}

	@Override
	public void setNeedsReturn(boolean needs) {
		this.needsReturn = needs;
	}

	@Override
	public Date getSendTime() {
		return sendTime;
	}

	@Override
	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}

}
