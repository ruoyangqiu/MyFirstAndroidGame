package com.example.getitems.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class ItemViewModel {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<ItemModel> ITEMS = new ArrayList<ItemModel>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, ItemModel> ITEM_MAP = new HashMap<String, ItemModel>();

    private static final int COUNT = 25;

    static {
        // Add some sample items.
        addItem(new ItemModel("Red Horn", "Ascient Instrument", 5, 6, 3, ItemLocationEnum.PrimaryHand, ItemAttributeEnum.Attack,"redhorn"));
        addItem(new ItemModel("Emperor Necklace", "Symbol of power", 0, 0, 15, ItemLocationEnum.Necklace, ItemAttributeEnum.Health,"emperornecklace"));
        addItem(new ItemModel("Golden Hair Pin", "Beautiful pin for ladies", 0, 0, 3,ItemLocationEnum.Head, ItemAttributeEnum.Defense,"goldenhairpin"));
    }

    private static void addItem(ItemModel item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }




    /**
     * A dummy item representing a piece of content.
     */
    public static class ItemModel {
        public final int Range;
        public final int Damage;
        public final int Value;
        public final String Name;
        public final String Description;
        public final String id = UUID.randomUUID().toString();
        public final String Guid = id;
        public final String ImageURI;
        public final ItemLocationEnum Location;
        public final ItemAttributeEnum Attribute;

        public ItemModel(String name,
                         String description,
                         int range,
                         int damage,
                         int value,
                         ItemLocationEnum location,
                         ItemAttributeEnum attribute,
                         String uri) {
            this.Name = name;
            this.Description = description;
            this.Range = range;
            this.Damage  = damage;
            this.Value = value;
            this.Location = location;
            this.ImageURI = uri;
            this.Attribute = attribute;
        }

        @Override
        public String toString() {
            return Name;
        }
    }
}
