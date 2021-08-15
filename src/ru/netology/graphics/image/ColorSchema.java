package ru.netology.graphics.image;

public class ColorSchema implements TextColorSchema{
    private final char[] COLOR_CODE_ARRAY = { '#', '$', '@', '%', '*', '+', '-', '.'};

    @Override
    public char convert(int color) {
        return COLOR_CODE_ARRAY[color / 32];
    }
}
