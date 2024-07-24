package org.sld.cmdfile.file_item;

import java.io.File;

public class Item {

    private File file;
    private ItemType type;

    public Item(File file, ItemType type) {
        this.file = file;
        this.type = type;
    }

    public File getFile() {
        return this.file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public ItemType getType() {
        return this.type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }
}
