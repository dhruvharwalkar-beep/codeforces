import java.io.*;
import java.util.*;
 
public class Main {
 
    static final long MOD = 1000000007L;
 
    // ================= FAST SCANNER =================
 
    static class FastScanner {
 
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0;
        private int len = 0;
 
        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
 
                if (len <= 0)
                    return -1;
            }
 
            return buffer[ptr++];
        }
 
        int nextInt() throws IOException {
            int c;
 
            do {
                c = read();
            } while (c <= ' ');
 
            int sign = 1;
 
            if (c == '-') {
                sign = -1;
                c = read();
            }
 
            int res = 0;
 
            while (c > ' ') {
                res = res * 10 + (c - '0');
                c = read();
            }
 
            return res * sign;
        }
 
        long nextLong() throws IOException {
            int c;
 
            do {
                c = read();
            } while (c <= ' ');
 
            long sign = 1;
 
            if (c == '-') {
                sign = -1;
                c = read();
            }
 
            long res = 0;
 
            while (c > ' ') {
                res = res * 10 + (c - '0');
                c = read();
            }
 
            return res * sign;
        }
 
        String next() throws IOException {
            int c;
 
            do {
                c = read();
            } while (c <= ' ');
 
            StringBuilder sb = new StringBuilder();
 
            while (c > ' ') {
                sb.append((char) c);
                c = read();
            }
 
            return sb.toString();
        }
 
        char nextChar() throws IOException {
            return next().charAt(0);
        }
    }
 
    // ================= ARRAY INPUT =================
 
    static int[] readIntArray(FastScanner fs, int n) throws IOException {
 
        int[] a = new int[n];
 
        for (int i = 0; i < n; i++) {
            a[i] = fs.nextInt();
        }
 
        return a;
    }
 
    static long[] readLongArray(FastScanner fs, int n) throws IOException {
 
        long[] a = new long[n];
 
        for (int i = 0; i < n; i++) {
            a[i] = fs.nextLong();
        }
 
        return a;
    }
 
    // ================= ARRAY FUNCTIONS =================
 
    static int max(int[] a) {
 
        int ans = Integer.MIN_VALUE;
 
        for (int x : a) {
            ans = Math.max(ans, x);
        }
 
        return ans;
    }
 
    static int min(int[] a) {
 
        int ans = Integer.MAX_VALUE;
 
        for (int x : a) {
            ans = Math.min(ans, x);
        }
 
        return ans;
    }
 
    static long max(long[] a) {
 
        long ans = Long.MIN_VALUE;
 
        for (long x : a) {
            ans = Math.max(ans, x);
        }
 
        return ans;
    }
 
    static long min(long[] a) {
 
        long ans = Long.MAX_VALUE;
 
        for (long x : a) {
            ans = Math.min(ans, x);
        }
 
        return ans;
    }
 
    // ================= BINARY SEARCH =================
 
    // First position >= x
    static int lowerBound(int[] a, int x) {
 
        int l = 0;
        int r = a.length;
 
        while (l < r) {
 
            int mid = l + (r - l) / 2;
 
            if (a[mid] >= x)
                r = mid;
            else
                l = mid + 1;
        }
 
        return l;
    }
 
    // First position > x
    static int upperBound(int[] a, int x) {
 
        int l = 0;
        int r = a.length;
 
        while (l < r) {
 
            int mid = l + (r - l) / 2;
 
            if (a[mid] > x)
                r = mid;
            else
                l = mid + 1;
        }
 
        return l;
    }
 
    // ================= MATH FUNCTIONS =================
 
    static long modAdd(long a, long b) {
 
        return ((a % MOD) + (b % MOD)) % MOD;
    }
 
    static long modSub(long a, long b) {
 
        return ((a % MOD) - (b % MOD) + MOD) % MOD;
    }
 
    static long modMul(long a, long b) {
 
        return ((a % MOD) * (b % MOD)) % MOD;
    }
 
    static long gcd(long a, long b) {
 
        while (b != 0) {
 
            long temp = a % b;
            a = b;
            b = temp;
        }
 
        return a;
    }
 
    static long lcm(long a, long b) {
 
        return (a / gcd(a, b)) * b;
    }
 
    // ================= SOLVE =================
 
    static void solve(FastScanner fs) throws Exception {
 
        int n = fs.nextInt();
 
        boolean[] levels = new boolean[n + 1];
 
        int p = fs.nextInt();
 
        for (int i = 0; i < p; i++) {
            int x = fs.nextInt();
            levels[x] = true;
        }
 
        int q = fs.nextInt();
 
        for (int i = 0; i < q; i++) {
            int x = fs.nextInt();
            levels[x] = true;
        }
 
        for (int i = 1; i <= n; i++) {
 
            if (!levels[i]) {
                System.out.println("Oh, my keyboard!");
                return;
            }
        }
 
        System.out.println("I become the guy.");
    }
 
    // ================= MAIN =================
 
    public static void main(String[] args) throws Exception {
 
        FastScanner fs = new FastScanner();
 
        int T = 1;
 
        // If the question has test cases:
        // T = fs.nextInt();
 
        while (T-- > 0) {
 
            solve(fs);
        }
    }
}