package com.example.gupao.vip.design.prototype.deep;

/**
 * @author zzf
 * @date 2018/6/10 19:51.
 */
public class Main {

    public static void main(String[] args) {
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();

        try {
            //浅复制
            QiTianDaSheng clone = (QiTianDaSheng) qiTianDaSheng.clone();

            System.out.println(qiTianDaSheng == clone);
            System.out.println(qiTianDaSheng.jinGuBang == clone.jinGuBang);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
