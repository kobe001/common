package com.hongfa.common.enums;

/**
 * 彩票游戏种类
 */
public enum LotteryType {

    //十一选五
    GD11X5("GUANGDONGELEVENPICKFIVE",5, "广东十一选五"),
    JX11X5("JIANGXIELEVENPICKFIVE",13, "江西十一选五"),
    SD11X5("SHANDONGELEVENPICKFIVE",14, "山东十一选五"),
    SH11X5("SHANGHAIELEVENPICKFIVE",15, "山东十一选五"),
    M1_11X5("ONEMINUTEELEVENPICKFIVE",49, "一分十一选五"),
    M3_11X5("THREEMINUTEELEVENPICKFIVE",39,"三分十一选五"),
    M5_11X5("FIVEMINUTEELEVENPICKFIVE",52, "五分十一选五"),

    //快三
    AHK3("ANHUIQUICKTHREE",1, "安徽快三"),
    GXK3("GUANGXIQUICKTHREE",30, "广西快三"),
    JSK3("JIANGSUQUICKTHREE",31, "江苏快三"),
    HBK3("HUBEIQUICKTHREE",32, "湖北快三"),
    BJK3("BEIJINGQUICKTHREE",33, "北京快三"),
    HEBK3("HEBEIQUICKTHREE",34,"河北快三"),
    GSK3("GANSUQUICKTHREE",35, "甘肃快三"),
    SHK3("SHANGHAIQUICKTHREE",36, "上海快三"),
    GZK3("GUIZHOUQUICKTHREE",37, "贵州快三"),
    JLK3("JILINQUICKTHREE",38, "吉林快三"),
    M1_K3("ONEMINUTEQUICKTHREE",44, "一分快三"),
    M3_K3("THREEMINUTEQUICKTHREE",27, "三分快三"),
    M5_K3("FIVEMINUTEQUICKTHREE",50, "五分快三"),

    //时时彩
    CQSSC("CHONGQINGFREQUENTLOTTERY",4, "重庆时时彩"),
    TJSSC("TIANJINFREQUENTLOTTERY",11, "天津时时彩"),
    XJSSC("XINJIANGFREQUENTLOTTERY",12, "新疆时时彩"),
    M1_SSC("ONEMINUTEFREQUENTLOTTERY",45, "一分时时彩"),
    M3_SSC("THREEMINUTEFREQUENTLOTTERY",6,"三分时时彩"),
    M5_SSC("FIVEMINUTEFREQUENTLOTTERY",55, "五分时时彩"),

    //pk10
    BJPK10("BEIJINGPK10",3, "北京赛车"),
    MLAFT("AIRSHIPPK10",29, "幸运飞艇"),
    M3_MLAFT("THREEMINUTEAIRSHIPPK10",43, "三分幸运飞艇"),
    M1_PK10("ONEMINUTEPK10",46, "一分赛车"),
    M3_PK10("THREEMINUTEPK10",8,"三分赛车"),
    M5_PK10("FIVEMINUTEPK10",51, "五分赛车"),
    M1_TX_PK10("TXONEMINUTEPK10",58, "腾讯一分pk10"),
    M3_TX_PK10("TXTHREEMINUTEPK10",59, "腾讯三分pk10"),
    M5_TX_PK10("TXFIVEMINUTEPK10",60, "腾讯五分pk10"),

    //快乐8
    BJKL8("PCEGGS",7, "北京快乐8"),
    JNDPCDD("CANADAPCEGGS",56, "加拿大pc蛋蛋"),
    XJPPCDD("SINGAPOREPCEGGS",57, "新加坡pc蛋蛋"),
    M1_PCDD("ONEMINUTEPCEGGS",47, "一分pc蛋蛋"),
    M5_PCDD("FIVEMINUTEPCEGGS",54, "五分pc蛋蛋"),

    //3D
    FC3D("THREED",18, "福彩3D"),
    M3_FC3D("THREEMINUTETHREED",41, "三分福彩3D"),

    //六合彩
    LHC("SIXMARK",9, "六合彩"),
    M1_LHC("ONEMINUTESIXMARK",48, "一分六合彩"),
    M5_LHC("FIVEMINUTESIXMARK",53, "五分六合彩"),
    KSLHC("QUICKSIXMARK",28, "快速六合彩"),

    //七星彩
    M1_QXC("ONEMINUTESEVENSTAR",66, "一分七星彩"),
    M3_QXC("THREEMINUTESEVENSTAR",65, "三分七星彩"),
    M5_QXC("FIVEMINUTESEVENSTAR",64, "五分七星彩"),

    //其他
    M1_TXFFC("TXONEMINUTEFREQUENTLOTTERY",61, "一分腾讯分分彩"),
    M3_TXFFC("TXTHREEMINUTEFREQUENTLOTTERY",62, "三分腾讯分分彩"),
    M5_TXFFC("TXFIVEMINUTEFREQUENTLOTTERY",63, "五分腾讯分分彩"),

    SHSSL("SHANGHAIFREQUENTHAPPY",10, "上海时时乐"),
    M3_SSL("THREEMINUTEFREQUENTHAPPY",40, "三分时时乐"),

    PL3("ARRANGETHREE",2, "排列三"),
    M3_PL3("THREEMINUTEARRANGETHREE",42, "三分排列三"),

    LUCK28("LUCK28",17, "幸运28"),

    //足球
    FOOTBALL("FOOTBALL",100001, "足彩");

    private String type;    //游戏类型
    private int code;       //游戏code
    private String detail;  //游戏详情

    LotteryType(String type, int code, String detail) {
        this.type = type;
        this.code = code;
        this.detail = detail;
    }

    /**
     * 根据枚举名获取type值
     * @param name
     * @return
     */
    public static String typeOfName(String name){
        try {
            return LotteryType.valueOf(name).type;
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

}
