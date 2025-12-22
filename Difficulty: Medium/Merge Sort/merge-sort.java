class Solution {

    void mergeSort(int arr[], int l, int r) {

        // base condition
        if (arr.length <= 1) return;

        int n = arr.length;

        // split arrays
        int[] a = new int[n / 2];
        int[] b = new int[n - n / 2];

        int idx = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = arr[idx++];
        }

        for (int i = 0; i < b.length; i++) {
            b[i] = arr[idx++];
        }

        // recursive calls (same style)
        mergeSort(a, 0, a.length - 1);
        mergeSort(b, 0, b.length - 1);

        // merge back into arr
        merge(a, b, arr);
    }

    static void merge(int[] a, int[] b, int[] c) {

        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j])
                c[k++] = a[i++];
            else
                c[k++] = b[j++];
        }

        while (i < a.length)
            c[k++] = a[i++];

        while (j < b.length)
            c[k++] = b[j++];
    }
}
