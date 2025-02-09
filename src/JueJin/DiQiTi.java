package JueJin;

import java.util.*;

public class DiQiTi {
    public static String solution(int n, String template_, String[] titles) {
        StringBuilder result = new StringBuilder();

        // 解析模板，分割成通配符和非通配符部分
        List<String> templateParts = new ArrayList<>();
        int i = 0;
        while (i < template_.length()) {
            if (template_.charAt(i) == '{') {
                int j = i + 1;
                while (j < template_.length() && template_.charAt(j) != '}') {
                    j++;
                }
                templateParts.add(template_.substring(i, j + 1)); // 加入通配符部分
                i = j + 1;
            } else {
                int j = i;
                while (j < template_.length() && template_.charAt(j) != '{') {
                    j++;
                }
                templateParts.add(template_.substring(i, j)); // 加入非通配符部分
                i = j;
            }
        }

        // 遍历每个标题，检查是否匹配模板
        for (String title : titles) {
            boolean isMatch = matchTitle(templateParts, title, 0, 0);
            result.append(isMatch ? "True," : "False,");
        }

        // 去掉最后一个逗号
        if (result.length() > 0) {
            result.deleteCharAt(result.length() - 1);
        }

        return result.toString();
    }

    // 递归匹配标题和模板
    private static boolean matchTitle(List<String> templateParts, String title, int partIndex, int titleIndex) {
        // 如果模板部分和标题都匹配完毕，返回 true
        if (partIndex == templateParts.size() && titleIndex == title.length()) {
            return true;
        }
        // 如果模板部分或标题超出范围，返回 false
        if (partIndex >= templateParts.size() || titleIndex > title.length()) {
            return false;
        }

        String part = templateParts.get(partIndex);
        if (part.startsWith("{")) {
            // 通配符部分，尝试匹配任意长度的字符（包括空字符串）
            for (int i = titleIndex; i <= title.length(); i++) {
                if (matchTitle(templateParts, title, partIndex + 1, i)) {
                    return true;
                }
            }
            return false;
        } else {
            // 非通配符部分，直接匹配
            if (title.startsWith(part, titleIndex)) {
                return matchTitle(templateParts, title, partIndex + 1, titleIndex + part.length());
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        String[] testTitles1 = {"adcdcefdfeffe", "adcdcefdfeff", "dcdcefdfeffe", "adcdcfe"};
        String[] testTitles2 = {"CLSomGhcQNvFuzENTAMLCqxBdj", "CLSomNvFuXTASzENTAMLCqxBdj", "CLSomFuXTASzExBdj", "CLSoQNvFuMLCqxBdj", "SovFuXTASzENTAMLCq", "mGhcQNvFuXTASzENTAMLCqx"};
        String[] testTitles3 = {"abcdefg", "abefg", "efg"};

        System.out.println(solution(4, "ad{xyz}cdc{y}f{x}e", testTitles1).equals("True,False,False,True"));
        System.out.println(solution(6, "{xxx}h{cQ}N{vF}u{XTA}S{NTA}MLCq{yyy}", testTitles2).equals("False,False,False,False,False,True"));
        System.out.println(solution(3, "a{bdc}efg", testTitles3).equals("True,True,False"));
    }
}
