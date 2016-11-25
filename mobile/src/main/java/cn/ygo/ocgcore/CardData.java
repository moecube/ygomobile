package cn.ygo.ocgcore;

import android.os.Parcel;
import android.os.Parcelable;

public class CardData implements Parcelable{

    public CardData() {
    }

    public long Code;
    public int Ot;
    public long Alias;
    public long Setcode;
    public long Type;
    public int Level;
    public int Attribute;
    public long Race;
    public int Attack;
    public int Defense;
    public int LScale;
    public int RScale;
    public String dbFile;

    @Override
    public String toString() {
        return "CardData{" +
                "Code=" + Code +
                ", Alias=" + Alias +
                ", Setcode=" + Setcode +
                ", Type=" + Type +
                ", Level=" + Level +
                ", Attribute=" + Attribute +
                ", Race=" + Race +
                ", Attack=" + Attack +
                ", Defense=" + Defense +
                ", LScale=" + LScale +
                ", RScale=" + RScale +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(this.Code);
        dest.writeInt(this.Ot);
        dest.writeLong(this.Alias);
        dest.writeLong(this.Setcode);
        dest.writeLong(this.Type);
        dest.writeInt(this.Level);
        dest.writeInt(this.Attribute);
        dest.writeLong(this.Race);
        dest.writeInt(this.Attack);
        dest.writeInt(this.Defense);
        dest.writeInt(this.LScale);
        dest.writeInt(this.RScale);
        dest.writeString(this.dbFile);
    }

    protected CardData(Parcel in) {
        this.Code = in.readLong();
        this.Ot = in.readInt();
        this.Alias = in.readLong();
        this.Setcode = in.readLong();
        this.Type = in.readLong();
        this.Level = in.readInt();
        this.Attribute = in.readInt();
        this.Race = in.readLong();
        this.Attack = in.readInt();
        this.Defense = in.readInt();
        this.LScale = in.readInt();
        this.RScale = in.readInt();
        this.dbFile = in.readString();
    }

}