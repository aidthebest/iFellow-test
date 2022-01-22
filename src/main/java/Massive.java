public class Massive {

        public static void main (String[] args)
        {
            double[] array = new double[10];
            for (int i = 0; i < array.length; i++) {
                array[i] = Math.random();
                System.out.println("Massive el " + array[i]);
            }

            double average = 0;
            if (array.length > 0)
            {
                double sum = 0;
                for (int k = 0; k < array.length; k++) {
                    sum += array[k];
                }
                average = sum / array.length;
            }
            System.out.println("Average is " + average);

            double maxEl = array[0];
            for (int i = 0; i < array.length; i++) maxEl = Math.max(maxEl, array[i]);
            System.out.println("MaxEl is " + maxEl);

            double minEl = array[0];
            for (int i = 0; i < array.length; i++) minEl = Math.min(minEl, array[i]);
            System.out.println("MinEl is " + minEl);
        }


    }

