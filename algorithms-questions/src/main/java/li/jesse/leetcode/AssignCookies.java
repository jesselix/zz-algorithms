package li.jesse.leetcode;

import java.util.Arrays;

public class AssignCookies {
    public static int findContentChildren(int[] g, int[] s) {
        int ret = 0;

        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0, j = 0;
        while (i < g.length && j < s.length) {
            if (g[i] <= s[j]) {
                ret++;
                i++;
                j++;
            }else if (g[i] > s[j]) {
                j++;
            }
        }

        return ret;
    }
}
