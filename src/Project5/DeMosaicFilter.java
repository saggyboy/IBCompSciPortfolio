package Project5;

/**
 * Filter that de-Mosaics the image.
 *
 */
public class DeMosaicFilter implements Filter {
    // no instance variables -- no state of objects

    /**
     * this filter takes a pixel image and flips it horizontally
     */
    public void filter(PixelImage image) {
        Pixel[][] data = image.getData();
        boolean evenGreen = false;

        for (int row = 3; row < image.getHeight()-3; row++) {

            for (int col = 3; col < image.getWidth()-3; col++) {
                Pixel current = data[row][col];

                if (current.red != 0) {
                    //Calculate avgGreen
                    int avgGreen = (data[row-1][col].green + data[row+1][col].green + data[row][col-1].green + data[row][col+1].green)/4;
                    current.green = avgGreen;

                    //Calculate avgBlue
                    int avgBlue = (data[row-1][col-1].blue + data[row-1][col+1].blue + data[row+1][col-1].blue + data[row+1][col+1].blue)/4;
                    current.blue = avgBlue;

                } else if (current.green != 0) {
                    int avgBlue;
                    int avgRed;

                    //Calculate avgBlue and avgRed
                    if (evenGreen){
                        avgBlue = (data[row-1][col].blue + data[row+1][col].blue)/2;
                        avgRed = (data[row][col-1].red + data[row][col+1].red)/2;
                    } else {
                        avgBlue = (data[row][col-1].blue + data[row][col+1].blue)/2;
                        avgRed = (data[row-1][col].red + data[row+1][col].red)/2;
                    }
                    current.blue = avgBlue;
                    current.red = avgRed;

                } else {
                    //Calculate avgGreen
                    int avgGreen = (data[row-1][col].green + data[row+1][col].green + data[row][col-1].green + data[row][col+1].green)/4;
                    current.green = avgGreen;

                    //Calculate avgRed
                    int avgRed = (data[row-1][col-1].red + data[row-1][col+1].red + data[row+1][col-1].red + data[row+1][col+1].red)/4;
                    current.red = avgRed;
                }
            }
            evenGreen = !evenGreen;
        }
        image.setData(data);
    }
}

