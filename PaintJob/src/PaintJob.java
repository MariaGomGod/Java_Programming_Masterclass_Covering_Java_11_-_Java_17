public class PaintJob {

    public static void main(String[] args) {
        System.out.println(getBucketCount(3.4, 1.5));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2 ));
    }

    private static int getBucketCount(double width, double height, double areaPerBucket) {

        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        return getBucketCount(width, height, areaPerBucket, 0);
    }

    // This method is used to compute the number of buckets we need to buy.
    private static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        return getBucketCount(width * height, areaPerBucket) - extraBuckets;
    }

    // This method is used to compute the TOTAL number of buckets we need to paint the wall.
    private static int getBucketCount(double area, double areaPerBucket) {

        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        return (int) Math.ceil(area / areaPerBucket);
    }
}
