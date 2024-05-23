private final long startTime = System.currentTimeMillis();

public Color hslRainbow(int index, float lowest, float biggest, int indexOffset, int timeSplit) {
    return Color.getHSBColor(
      (Math.abs((((System.currentTimeMillis() - startTime) + index * indexOffset) / (float) timeSplit) % 2 - 1) * (biggest - lowest)) + lowest,
        0.7f,
        1f
  );
}
