package com.example.gupao.vip.design.prototype.deep;

import java.io.*;
import java.util.Date;

/**
 * @author zzf
 * @date 2018/6/10 19:47.
 */
public class QiTianDaSheng extends Monkey implements Cloneable, Serializable {

    public JinGuBang jinGuBang;

    public QiTianDaSheng() {
        this.birth = new Date();
        this.jinGuBang = new JinGuBang();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //deepClone();
    }

    /**
     * 深复制，所有属性都复制
     * @return
     */
    public Object deepClone() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            return (QiTianDaSheng) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public QiTianDaSheng copy(QiTianDaSheng target) {
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        qiTianDaSheng.jinGuBang = new JinGuBang();
        qiTianDaSheng.birth = new Date();
        return qiTianDaSheng;
    }
}
