public class PraktNilai05 {

    int uts[], uas[];

    PraktNilai05(int n) {
        uts = new int[n];
        uas = new int[n];
    }

    int maxUTS(int l, int r) {
        if (l == r) {
            return uts[l];
        } else {
            int mid = (l + r) / 2;
            int lmax = maxUTS(l, mid);
            int rmax = maxUTS(mid + 1, r);
            if (lmax > rmax) {
                return lmax;
            } else {
                return rmax;
            }
        }
    }

    int minUTS(int l, int r) {
        if (l == r) {
            return uts[l];
        } else {
            int mid = (l + r) / 2;
            int lmin = minUTS(l, mid);
            int rmin = minUTS(mid + 1, r);
            if (lmin < rmin) {
                return lmin;
            } else {
                return rmin;
            }
        }
    }

    double rataUAS() {
        double total = 0;
        for (int i = 0; i < uas.length; i++) {
            total = total + uas[i];
        }
        return total / uas.length;
    }
}