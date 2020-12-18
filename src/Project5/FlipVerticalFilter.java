package Project5;

public class FlipVerticalFilter implements Filter{
    // no instance variables -- no state of objects

    /** this filter takes a pixel image and flips it horizontally */
    public void filter(PixelImage image) {
        Pixel[][] data = image.getData();

        for (int row = 0; row < image.getHeight()/2; row++) {
            for (int col = 0; col < image.getWidth(); col++) {
                Pixel temp = data[row][col];
                data[row][col] = data[image.getHeight() - row - 1][col];
                data[image.getHeight() - row - 1][col] = temp;
            }
        }
        image.setData(data);
    }
}
