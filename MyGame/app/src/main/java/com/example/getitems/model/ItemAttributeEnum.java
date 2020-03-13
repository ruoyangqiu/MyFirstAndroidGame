package com.example.getitems.model;

import com.example.getitems.GlobalModel;
import com.example.getitems.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum ItemAttributeEnum {
    // Need to match the service values
    Unknown(0),

    // Attack Attribute, Buff damage
    Attack(10),

    // Defense Attribute, Reduce intake Damage
    Defense(12),

    // Attack Attribute, decide turn order
    Speed(20),

    // Attack Attribute, Max health
    Health(22);

    // Returns the Localized String
    // Make sure all strings are in the string table
    @Override
    public String toString() {
        switch(this){
            case Unknown:
                return GlobalModel.MainActivityContext.getString(R.string.Unknown);
            case Attack:
                return GlobalModel.MainActivityContext.getString(R.string.Attack);
            case Defense:
                return GlobalModel.MainActivityContext.getString(R.string.Defence);
            case Speed:
                return GlobalModel.MainActivityContext.getString(R.string.Speed);
            case Health:
                return GlobalModel.MainActivityContext.getString(R.string.Health);

        }
        return "Unknown";
    }

    private int intValue;
    private static final List<String> VALUES;

    static {
        VALUES = new ArrayList<>();
        for (ItemLocationEnum someEnum : ItemLocationEnum.values()) {
            VALUES.add(someEnum.toString());
        }
    }

    public static List<String> getValues() {
        return Collections.unmodifiableList(VALUES);
    }

    ItemAttributeEnum(int value) {
        intValue = value;
    }

    // Lookup the string for the value
    public static String getString(int value){
        for (ItemAttributeEnum item : ItemAttributeEnum.values()) {
            if (value == item.intValue){
                return item.toString();
            }
        }
        return null;
    }

    // Lookup the value for the string
    public static int getValue(String string){
        for (ItemAttributeEnum item : ItemAttributeEnum.values()) {
            if (string.equals(item.toString())){
                return item.intValue;
            }
        }
        return -1;
    }
}
