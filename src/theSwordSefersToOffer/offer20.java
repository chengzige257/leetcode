package theSwordSefersToOffer;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class offer20 {
//表示数值的字符串
// 若干空格
// 一个 小数 或者 整数
// （可选）一个 'e' 或 'E' ，后面跟着一个 整数
// 若干空格
//
//
// 小数（按顺序）可以分成以下几个部分：
//
//
// （可选）一个符号字符（'+' 或 '-'）
// 下述格式之一：
//
// 至少一位数字，后面跟着一个点 '.'
// 至少一位数字，后面跟着一个点 '.' ，后面再跟着至少一位数字
// 一个点 '.' ，后面跟着至少一位数字

// 整数（按顺序）可以分成以下几个部分：
// （可选）一个符号字符（'+' 或 '-'）
// 至少一位数字
    public boolean isNumber(String s) {
        Map<status, Map<character,status>> table = new HashMap<>();
        Map<character,status> map1 = new HashMap<>(){{
            put(character.number,status.integerPart);
            put(character.blank,status.startBlank);
            put(character.sign,status.startSign);
            put(character.point,status.pointLeftNoNum);
        }};
        table.put(status.startBlank,map1);

        Map<character,status> map2 = new HashMap<>(){{
            put(character.number,status.integerPart);
            put(character.point,status.pointLeftNoNum);
        }};
        table.put(status.startSign,map2);

        Map<character,status> map3 = new HashMap<>(){{
            put(character.number,status.integerPart);
            put(character.blank,status.endBlank);
            put(character.point,status.pointLeftHasNum);
            put(character.e,status.E);
        }};
        table.put(status.integerPart,map3);

        Map<character,status> map4 = new HashMap<>(){{
            put(character.number,status.fractionalPart);
            put(character.blank,status.endBlank);
            put(character.e,status.E);
        }};
        table.put(status.pointLeftHasNum,map4);

        Map<character,status> map5 = new HashMap<>(){{
            put(character.number,status.fractionalPart);
        }};
        table.put(status.pointLeftNoNum,map5);

        Map<character,status> map6 = new HashMap<>(){{
            put(character.number,status.fractionalPart);
            put(character.blank,status.endBlank);
            put(character.e,status.E);
        }};
        table.put(status.fractionalPart,map6);

        Map<character,status> map7 = new HashMap<>(){{
            put(character.number,status.secondInteger);
            put(character.sign,status.endSign);
        }};
        table.put(status.E,map7);

        Map<character,status> map8 = new HashMap<>(){{
            put(character.number,status.secondInteger);
        }};
        table.put(status.endSign,map8);

        Map<character,status> map9 = new HashMap<>(){{
            put(character.number,status.secondInteger);
            put(character.blank,status.endBlank);
        }};
        table.put(status.secondInteger,map9);

        Map<character,status> map10 = new HashMap<>(){{
            put(character.blank,status.endBlank);
        }};
        table.put(status.endBlank,map10);

        status start = status.startBlank;
        int length = s.length();
        for(int i = 0;i<length;i++){
            char c = s.charAt(i);
            character current = getType(c);
            if(!table.get(start).containsKey(current))
                return false;
            start = table.get(start).get(current);
        }
        return  start == status.integerPart||
                start == status.pointLeftHasNum||
                start == status.fractionalPart||
                start == status.secondInteger||
                start == status.endBlank;
    }

    character getType(char c){
        if(c==' ')
            return character.blank;
        if(c=='.')
            return character.point;
        if(c=='+'||c=='-')
            return character.sign;
        if(c>='0'&&c<='9')
            return character.number;
        if(c=='e'||c=='E')
            return character.e;
        return character.other;
    }
    enum status{
        startBlank,
        startSign,
        integerPart,
        pointLeftHasNum,
        pointLeftNoNum,
        fractionalPart,
        E,
        endSign,
        secondInteger,
        endBlank
    }
    enum character{
        number,
        blank,
        sign,
        point,
        e,
        other
    }
    @Test
    public void main() {
        isNumber("0..");
    }
}
