package cn.codethink.qfys521.phigros;

import cn.chuanwise.xiaoming.annotation.Filter;
import cn.chuanwise.xiaoming.annotation.Required;
import cn.chuanwise.xiaoming.interactor.SimpleInteractors;
import cn.chuanwise.xiaoming.user.XiaoMingUser;
import cn.codethink.qfys521.qfys521UtilPlugin;


public class Songs extends SimpleInteractors<qfys521UtilPlugin> {
    final String perm = "qfys521Util.";

    @Filter("random")
    @Filter("随机歌曲")
    @Required(perm + "phigros")
    void 随机歌曲(XiaoMingUser user) {
        int count = (int) (Math.random() * 141);
        switch (count) {
            case 1:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "2.1.1\n" +
                                "曲名" + ":" + " " + "996\n" +
                                "EZ定数" + ":" + " " + "3.8\n" +
                                "HD定数" + ":" + " " + "8.1\n" +
                                "IN定数" + ":" + " " + "14.5\n"
                );
                break;
            case 2:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Chapter-Legacy\n" +
                                "加入版本" + ":" + " " + "1.0.0\n" +
                                "曲名" + ":" + " " + "[PRAW]\n" +
                                "EZ定数" + ":" + " " + "4.4\n" +
                                "HD定数" + ":" + " " + "11.8\n" +
                                "IN定数" + ":" + " " + "14.9\n"
                );
                break;
            case 3:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Side story2- 弭刻日\n" +
                                "加入版本" + ":" + " " + "2.2.0\n" +
                                "曲名" + ":" + " " + "After Dawn\n" +
                                "EZ定数" + ":" + " " + "4.4\n" +
                                "HD定数" + ":" + " " + "11.1\n" +
                                "IN定数" + ":" + " " + "15.3\n"
                );
                break;
            case 4:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "1.2.5\n" +
                                "曲名" + ":" + " " + "Aleph-0\n" +
                                "EZ定数" + ":" + " " + "4.5\n" +
                                "HD定数" + ":" + " " + "11.6\n" +
                                "IN定数" + ":" + " " + "15.6\n"
                );
                break;
            case 5:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "ChapterEX-KALPA 精选集\n" +
                                "加入版本" + ":" + " " + "2.1.0\n" +
                                "曲名" + ":" + " " + "Another Me\n" +
                                "EZ定数" + ":" + " " + "4.8\n" +
                                "HD定数" + ":" + " " + "9.2\n" +
                                "IN定数" + ":" + " " + "15.5\n"
                );
                break;
            case 6:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "ChapterEX-Rising Sun Traxx 精选集\n" +
                                "加入版本" + ":" + " " + "1.4.0\n" +
                                "曲名" + ":" + " " + "Another Me⁠\n" +
                                "EZ定数" + ":" + " " + "1.7\n" +
                                "HD定数" + ":" + " " + "5.6\n" +
                                "IN定数" + ":" + " " + "13.6\n"
                );
                break;
            case 7:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "2.1.1\n" +
                                "曲名" + ":" + " " + "Another Round\n" +
                                "EZ定数" + ":" + " " + "3.2\n" +
                                "HD定数" + ":" + " " + "7.5\n" +
                                "IN定数" + ":" + " " + "13.3\n"
                );
                break;
            case 8:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "1.2.0\n" +
                                "曲名" + ":" + " " + "Aphasia\n" +
                                "EZ定数" + ":" + " " + "4.2\n" +
                                "HD定数" + ":" + " " + "8.8\n" +
                                "IN定数" + ":" + " " + "13.1\n"
                );
                break;
            case 9:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "1.6.10\n" +
                                "曲名" + ":" + " " + "Apocalyptic\n" +
                                "EZ定数" + ":" + " " + "3.2\n" +
                                "HD定数" + ":" + " " + "9.6\n" +
                                "IN定数" + ":" + " " + "13.4\n"
                );
                break;
            case 10:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Side story2- 弭刻日\n" +
                                "加入版本" + ":" + " " + "2.2.0\n" +
                                "曲名" + ":" + " " + "Ark\n" +
                                "EZ定数" + ":" + " " + "4.4\n" +
                                "HD定数" + ":" + " " + "10.9\n" +
                                "IN定数" + ":" + " " + "14.9\n"
                );
                break;
            case 11:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "2.0.0\n" +
                                "曲名" + ":" + " " + "-Arkhei-\n" +
                                "EZ定数" + ":" + " " + "5.5\n" +
                                "HD定数" + ":" + " " + "9.7\n" +
                                "IN定数" + ":" + " " + "12.1\n"
                );
                break;
            case 12:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "1.6.2\n" +
                                "曲名" + ":" + " " + "Äventyr\n" +
                                "EZ定数" + ":" + " " + "2.3\n" +
                                "HD定数" + ":" + " " + "9.4\n" +
                                "IN定数" + ":" + " " + "13.7\n"
                );
                break;
            case 13:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "1.6.7\n" +
                                "曲名" + ":" + " " + "Better Graphic Animation\n" +
                                "EZ定数" + ":" + " " + "6.4\n" +
                                "HD定数" + ":" + " " + "11.7\n" +
                                "IN定数" + ":" + " " + "15.3\n"
                );
                break;
            case 14:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Chapter4-管道迷宫\n" +
                                "加入版本" + ":" + " " + "1.1.0\n" +
                                "曲名" + ":" + " " + "Bonus Time\n" +
                                "EZ定数" + ":" + " " + "4.7\n" +
                                "HD定数" + ":" + " " + "9.3\n" +
                                "IN定数" + ":" + " " + "14.2\n"
                );
                break;
            case 15:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "ChapterEX-Rising Sun Traxx 精选集\n" +
                                "加入版本" + ":" + " " + "1.4.0\n" +
                                "曲名" + ":" + " " + "Break Through The Barrier\n" +
                                "EZ定数" + ":" + " " + "5.9\n" +
                                "HD定数" + ":" + " " + "10.8\n" +
                                "IN定数" + ":" + " " + "14.9\n"
                );
                break;
            case 16:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "1.2.4\n" +
                                "曲名" + ":" + " " + "Burn\n" +
                                "EZ定数" + ":" + " " + "4.2\n" +
                                "HD定数" + ":" + " " + "10.6\n" +
                                "IN定数" + ":" + " " + "14.8\n"
                );
                break;
            case 17:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Chapter-Legacy\n" +
                                "加入版本" + ":" + " " + "1.0.0\n" +
                                "曲名" + ":" + " " + "Cereris\n" +
                                "EZ定数" + ":" + " " + "6.9\n" +
                                "HD定数" + ":" + " " + "10.5\n" +
                                "IN定数" + ":" + " " + "14.8\n"
                );
                break;
            case 18:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "1.6.3\n" +
                                "曲名" + ":" + " " + "Cervelle Connexion\n" +
                                "EZ定数" + ":" + " " + "4.8\n" +
                                "HD定数" + ":" + " " + "11.3\n" +
                                "IN定数" + ":" + " " + "14.5\n"
                );
                break;
            case 19:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Chapter7-时钟链接\n" +
                                "加入版本" + ":" + " " + "2.0.0\n" +
                                "曲名" + ":" + " " + "Chronologika\n" +
                                "EZ定数" + ":" + " " + "3.7\n" +
                                "HD定数" + ":" + " " + "9.8\n" +
                                "IN定数" + ":" + " " + "13.9\n"
                );
                break;
            case 20:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Chapter7-时钟链接\n" +
                                "加入版本" + ":" + " " + "2.0.0\n" +
                                "曲名" + ":" + " " + "Chronomia\n" +
                                "EZ定数" + ":" + " " + "4.7\n" +
                                "HD定数" + ":" + " " + "10.4\n" +
                                "IN定数" + ":" + " " + "15.3\n"
                );
                break;
            case 21:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Chapter7-时钟链接\n" +
                                "加入版本" + ":" + " " + "2.0.0\n" +
                                "曲名" + ":" + " " + "Chronos Collapse - La Campanella\n" +
                                "EZ定数" + ":" + " " + "2.8\n" +
                                "HD定数" + ":" + " " + "10.6\n" +
                                "IN定数" + ":" + " " + "15.9\n"
                );
                break;
            case 22:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "ChapterEX-Rising Sun Traxx 精选集\n" +
                                "加入版本" + ":" + " " + "1.4.0\n" +
                                "曲名" + ":" + " " + "Chronostasis\n" +
                                "EZ定数" + ":" + " " + "6.8\n" +
                                "HD定数" + ":" + " " + "11.6\n" +
                                "IN定数" + ":" + " " + "15.9\n"
                );
                break;
            case 23:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Chapter-Legacy\n" +
                                "加入版本" + ":" + " " + "1.0.0\n" +
                                "曲名" + ":" + " " + "Cipher : /2&//<|0\n" +
                                "EZ定数" + ":" + " " + "6.8\n" +
                                "HD定数" + ":" + " " + "10.8\n" +
                                "IN定数" + ":" + " " + "14.7\n"
                );
                break;
            case 141:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Chapter4-管道迷宫\n" +
                                "加入版本" + ":" + " " + "1.1.0\n" +
                                "曲名" + ":" + " " + "Class Memories\n" +
                                "EZ定数" + ":" + " " + "4.5\n" +
                                "HD定数" + ":" + " " + "8.9\n" +
                                "IN定数" + ":" + " " + "13.5\n"
                );
                break;
            case 25:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Chapter7-时钟链接\n" +
                                "加入版本" + ":" + " " + "2.0.0\n" +
                                "曲名" + ":" + " " + "Clock Paradox\n" +
                                "EZ定数" + ":" + " " + "2.3\n" +
                                "HD定数" + ":" + " " + "5.8\n" +
                                "IN定数" + ":" + " " + "12.6\n"
                );
                break;
            case 26:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Chapter6-方舟蜃景\n" +
                                "加入版本" + ":" + " " + "1.5.0\n" +
                                "曲名" + ":" + " " + "Colorful Days♪\n" +
                                "EZ定数" + ":" + " " + "4.6\n" +
                                "HD定数" + ":" + " " + "7.1\n" +
                                "IN定数" + ":" + " " + "12.7\n"
                );
                break;
            case 27:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "2.1.0\n" +
                                "曲名" + ":" + " " + "Concvssion\n" +
                                "EZ定数" + ":" + " " + "4.1\n" +
                                "HD定数" + ":" + " " + "10.2\n" +
                                "IN定数" + ":" + " " + "15.5\n"
                );
                break;
            case 28:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Chapter-Legacy\n" +
                                "加入版本" + ":" + " " + "1.0.0\n" +
                                "曲名" + ":" + " " + "Credits\n" +
                                "EZ定数" + ":" + " " + "4.4\n" +
                                "HD定数" + ":" + " " + "10.4\n" +
                                "IN定数" + ":" + " " + "13.7\n"
                );
                break;
            case 29:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "ChapterEX-HyuN 精选集\n" +
                                "加入版本" + ":" + " " + "1.4.2\n" +
                                "曲名" + ":" + " " + "CROSS † SOUL\n" +
                                "EZ定数" + ":" + " " + "7.7\n" +
                                "HD定数" + ":" + " " + "12.8\n" +
                                "IN定数" + ":" + " " + "15.9\n"
                );
                break;
            case 30:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Chapter5-霓虹灯牌\n" +
                                "加入版本" + ":" + " " + "1.3.0\n" +
                                "曲名" + ":" + " " + "cryout\n" +
                                "EZ定数" + ":" + " " + "4.3\n" +
                                "HD定数" + ":" + " " + "9.9\n" +
                                "IN定数" + ":" + " " + "13.7\n"
                );
                break;
            case 31:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "ChapterEX-Muse Dash 精选集\n" +
                                "加入版本" + ":" + " " + "1.6.8\n" +
                                "曲名" + ":" + " " + "Cthugha\n" +
                                "EZ定数" + ":" + " " + "7.2\n" +
                                "HD定数" + ":" + " " + "12.3\n" +
                                "IN定数" + ":" + " " + "15.7\n" +
                                "AT定数" + ":" + " " + "15.9"
                );
                break;
            case 32:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "1.0.0\n" +
                                "曲名" + ":" + " " + "Dash\n" +
                                "EZ定数" + ":" + " " + "2.5\n" +
                                "HD定数" + ":" + " " + "5.7\n" +
                                "IN定数" + ":" + " " + "11.7\n"
                );
                break;
            case 33:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "1.0.0\n" +
                                "曲名" + ":" + " " + "dB doll\n" +
                                "EZ定数" + ":" + " " + "1.3\n" +
                                "HD定数" + ":" + " " + "3.6\n" +
                                "IN定数" + ":" + " " + "6.2\n" +
                                "AT定数" + ":" + " " + "13.6"
                );
                break;
            case 34:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "1.4.1\n" +
                                "曲名" + ":" + " " + "Dead Soul\n" +
                                "EZ定数" + ":" + " " + "4.3\n" +
                                "HD定数" + ":" + " " + "11.7\n" +
                                "IN定数" + ":" + " " + "14.4\n"
                );
                break;
            case 35:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Side story2- 弭刻日\n" +
                                "加入版本" + ":" + " " + "2.1.3\n" +
                                "曲名" + ":" + " " + "Demiurge\n" +
                                "EZ定数" + ":" + " " + "1.4\n" +
                                "HD定数" + ":" + " " + "7.4\n" +
                                "IN定数" + ":" + " " + "11.8\n"
                );
                break;
            case 36:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Side story2- 弭刻日\n" +
                                "加入版本" + ":" + " " + "2.2.0\n" +
                                "曲名" + ":" + " " + "Demonkin\n" +
                                "EZ定数" + ":" + " " + "6.1\n" +
                                "HD定数" + ":" + " " + "10.7\n" +
                                "IN定数" + ":" + " " + "13.7\n"
                );
                break;
            case 37:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "ChapterEX-HyuN 精选集\n" +
                                "加入版本" + ":" + " " + "1.4.2\n" +
                                "曲名" + ":" + " " + "Disorder\n" +
                                "EZ定数" + ":" + " " + "5.4\n" +
                                "HD定数" + ":" + " " + "9.8\n" +
                                "IN定数" + ":" + " " + "14.7\n"
                );
                break;
            case 38:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Chapter-Legacy\n" +
                                "加入版本" + ":" + " " + "1.0.0\n" +
                                "曲名" + ":" + " " + "Dlyrotz\n" +
                                "EZ定数" + ":" + " " + "6.5\n" +
                                "HD定数" + ":" + " " + "11.7\n" +
                                "IN定数" + ":" + " " + "14.6\n"
                );
                break;
            case 39:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "ChapterEX-KALPA 精选集\n" +
                                "加入版本" + ":" + " " + "2.1.0\n" +
                                "曲名" + ":" + " " + "Don't Never Around\n" +
                                "EZ定数" + ":" + " " + "4.4\n" +
                                "HD定数" + ":" + " " + "11.7\n" +
                                "IN定数" + ":" + " " + "15.6\n"
                );
                break;
            case 40:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "1.0.0\n" +
                                "曲名" + ":" + " " + "Doppelganger\n" +
                                "EZ定数" + ":" + " " + "4.8\n" +
                                "HD定数" + ":" + " " + "9.4\n" +
                                "IN定数" + ":" + " " + "14.8\n"
                );
                break;
            case 24:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "2.1.1\n" +
                                "曲名" + ":" + " " + "Dreamland\n" +
                                "EZ定数" + ":" + " " + "5.2\n" +
                                "HD定数" + ":" + " " + "9.8\n" +
                                "IN定数" + ":" + " " + "13.2\n"
                );
                break;
            case 41:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "1.0.0\n" +
                                "曲名" + ":" + " " + "Drop It\n" +
                                "EZ定数" + ":" + " " + "3.8\n" +
                                "HD定数" + ":" + " " + "9.6\n" +
                                "IN定数" + ":" + " " + "14.1\n"
                );
                break;
            case 42:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "1.5.7\n" +
                                "曲名" + ":" + " " + "Electron\n" +
                                "EZ定数" + ":" + " " + "3.7\n" +
                                "HD定数" + ":" + " " + "10.4\n" +
                                "IN定数" + ":" + " " + "13.2\n"
                );
                break;
            case 43:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "1.6.6\n" +
                                "曲名" + ":" + " " + "Eltaw\n" +
                                "EZ定数" + ":" + " " + "5.8\n" +
                                "HD定数" + ":" + " " + "10.5\n" +
                                "IN定数" + ":" + " " + "14.4\n"
                );
                break;
            case 44:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "1.5.2\n" +
                                "曲名" + ":" + " " + "End Me\n" +
                                "EZ定数" + ":" + " " + "5.8\n" +
                                "HD定数" + ":" + " " + "7.5\n" +
                                "IN定数" + ":" + " " + "14.3\n"
                );
                break;
            case 45:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Chapter4-管道迷宫\n" +
                                "加入版本" + ":" + " " + "1.1.0\n" +
                                "曲名" + ":" + " " + "ENERGY SYNERGY MATRIX\n" +
                                "EZ定数" + ":" + " " + "5.9\n" +
                                "HD定数" + ":" + " " + "10.7\n" +
                                "IN定数" + ":" + " " + "14.8\n"
                );
                break;
            case 46:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "1.6.11\n" +
                                "曲名" + ":" + " " + "energy trixxx\n" +
                                "EZ定数" + ":" + " " + "4.3\n" +
                                "HD定数" + ":" + " " + "11.4\n" +
                                "IN定数" + ":" + " " + "15.2\n"
                );
                break;
            case 47:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Chapter-Legacy\n" +
                                "加入版本" + ":" + " " + "1.0.0\n" +
                                "曲名" + ":" + " " + "Engine x Start!! (melody mix)\n" +
                                "EZ定数" + ":" + " " + "4.7\n" +
                                "HD定数" + ":" + " " + "10.5\n" +
                                "IN定数" + ":" + " " + "13.4\n"
                );
                break;
            case 48:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Chapter-Legacy\n" +
                                "加入版本" + ":" + " " + "1.0.0\n" +
                                "曲名" + ":" + " " + "Eradication Catastrophe\n" +
                                "EZ定数" + ":" + " " + "3.5\n" +
                                "HD定数" + ":" + " " + "7.5\n" +
                                "IN定数" + ":" + " " + "11.6\n"
                );
                break;
            case 49:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "ChapterEX-Muse Dash 精选集\n" +
                                "加入版本" + ":" + " " + "1.6.8\n" +
                                "曲名" + ":" + " " + "Final Step!\n" +
                                "EZ定数" + ":" + " " + "5.9\n" +
                                "HD定数" + ":" + " " + "11.8\n" +
                                "IN定数" + ":" + " " + "14.3\n"
                );
                break;
            case 50:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "1.2.1\n" +
                                "曲名" + ":" + " " + "Find_Me\n" +
                                "EZ定数" + ":" + " " + "5.7\n" +
                                "HD定数" + ":" + " " + "10.5\n" +
                                "IN定数" + ":" + " " + "14.4\n"
                );
                break;
            case 51:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Chapter-Legacy\n" +
                                "加入版本" + ":" + " " + "1.0.0\n" +
                                "曲名" + ":" + " " + "FULi AUTO SHOOTER\n" +
                                "EZ定数" + ":" + " " + "4.1\n" +
                                "HD定数" + ":" + " " + "11.3\n" +
                                "IN定数" + ":" + " " + "14.8\n"
                );
                break;
            case 52:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "2.1.4\n" +
                                "曲名" + ":" + " " + "FULi AUTO BUSTER\n" +
                                "EZ定数" + ":" + " " + "4.8\n" +
                                "HD定数" + ":" + " " + "8.6\n" +
                                "IN定数" + ":" + " " + "14.7\n"
                );
                break;
            case 53:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "2.1.2\n" +
                                "曲名" + ":" + " " + "Future Mind\n" +
                                "EZ定数" + ":" + " " + "5.3\n" +
                                "HD定数" + ":" + " " + "11.7\n" +
                                "IN定数" + ":" + " " + "14.6\n"
                );
                break;
            case 54:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "1.4.4\n" +
                                "曲名" + ":" + " " + "Get Back\n" +
                                "EZ定数" + ":" + " " + "6.6\n" +
                                "HD定数" + ":" + " " + "11.4\n" +
                                "IN定数" + ":" + " " + "13.8\n"
                );
                break;
            case 55:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "ChapterEX-WAVEAT 精选集\n" +
                                "加入版本" + ":" + " " + "1.6.7\n" +
                                "曲名" + ":" + " " + "Get Ready!!\n" +
                                "EZ定数" + ":" + " " + "4.5\n" +
                                "HD定数" + ":" + " " + "8.7\n" +
                                "IN定数" + ":" + " " + "13.5\n"
                );
                break;
            case 56:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Chapter-Legacy\n" +
                                "加入版本" + ":" + " " + "1.0.0\n" +
                                "曲名" + ":" + " " + "Glaciaxion\n" +
                                "EZ定数" + ":" + " " + "1.1\n" +
                                "HD定数" + ":" + " " + "6.7\n" +
                                "IN定数" + ":" + " " + "12.5\n"
                );
                break;
            case 57:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "ChapterEX-GOOD 精选集\n" +
                                "加入版本" + ":" + " " + "1.4.7\n" +
                                "曲名" + ":" + " " + "GOODBOUNCE\n" +
                                "EZ定数" + ":" + " " + "5.7\n" +
                                "HD定数" + ":" + " " + "11.6\n" +
                                "IN定数" + ":" + " " + "14.4\n"
                );
                break;
            case 58:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "ChapterEX-GOOD 精选集\n" +
                                "加入版本" + ":" + " " + "1.4.7\n" +
                                "曲名" + ":" + " " + "GOODFORTUNE\n" +
                                "EZ定数" + ":" + " " + "7.3\n" +
                                "HD定数" + ":" + " " + "8.7\n" +
                                "IN定数" + ":" + " " + "15.4\n"
                );
                break;
            case 59:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "ChapterEX-GOOD 精选集\n" +
                                "加入版本" + ":" + " " + "1.4.7\n" +
                                "曲名" + ":" + " " + "GOODRAGE\n" +
                                "EZ定数" + ":" + " " + "4.6\n" +
                                "HD定数" + ":" + " " + "7.8\n" +
                                "IN定数" + ":" + " " + "15.8\n"
                );
                break;
            case 60:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "ChapterEX-GOOD 精选集\n" +
                                "加入版本" + ":" + " " + "1.4.7\n" +
                                "曲名" + ":" + " " + "GOODTEK\n" +
                                "EZ定数" + ":" + " " + "5.4\n" +
                                "HD定数" + ":" + " " + "10.8\n" +
                                "IN定数" + ":" + " " + "14.2\n"
                );
                break;
            case 61:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "ChapterEX-GOOD 精选集\n" +
                                "加入版本" + ":" + " " + "1.4.7\n" +
                                "曲名" + ":" + " " + "GOODWORLD\n" +
                                "EZ定数" + ":" + " " + "3.2\n" +
                                "HD定数" + ":" + " " + "11.4\n" +
                                "IN定数" + ":" + " " + "14.5\n"
                );
                break;
            case 62:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "1.6.1\n" +
                                "曲名" + ":" + " " + "Hardcore Kwaya\n" +
                                "EZ定数" + ":" + " " + "4.3\n" +
                                "HD定数" + ":" + " " + "9.2\n" +
                                "IN定数" + ":" + " " + "14.6\n"
                );
                break;
            case 63:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "ChapterEX-KALPA 精选集\n" +
                                "加入版本" + ":" + " " + "2.1.0\n" +
                                "曲名" + ":" + " " + "HAZARD\n" +
                                "EZ定数" + ":" + " " + "3.6\n" +
                                "HD定数" + ":" + " " + "10.9\n" +
                                "IN定数" + ":" + " " + "14.7\n"
                );
                break;
            case 64:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Chapter-Legacy\n" +
                                "加入版本" + ":" + " " + "1.0.0\n" +
                                "曲名" + ":" + " " + "HumaN\n" +
                                "EZ定数" + ":" + " " + "5.6\n" +
                                "HD定数" + ":" + " " + "8.8\n" +
                                "IN定数" + ":" + " " + "12.6\n"
                );
                break;
            case 65:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "2.2.1\n" +
                                "曲名" + ":" + " " + "I Must Say No\n" +
                                "EZ定数" + ":" + " " + "2.6\n" +
                                "HD定数" + ":" + " " + "9.5\n" +
                                "IN定数" + ":" + " " + "13.5\n"
                );
                break;
            case 66:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Chapter6-方舟蜃景\n" +
                                "加入版本" + ":" + " " + "1.5.0\n" +
                                "曲名" + ":" + " " + "Igallta\n" +
                                "EZ定数" + ":" + " " + "7.7\n" +
                                "HD定数" + ":" + " " + "12.7\n" +
                                "IN定数" + ":" + " " + "15.6\n" +
                                "AT定数" + ":" + " " + "16.7"
                );
                break;
            case 67:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Side story2- 弭刻日\n" +
                                "加入版本" + ":" + " " + "2.2.0\n" +
                                "曲名" + ":" + " " + "INFiNiTE ENERZY -Overdoze-\n" +
                                "EZ定数" + ":" + " " + "7.5\n" +
                                "HD定数" + ":" + " " + "12.4\n" +
                                "IN定数" + ":" + " " + "14.6\n"
                );
                break;
            case 68:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "ChapterEX-HyuN 精选集\n" +
                                "加入版本" + ":" + " " + "1.4.2\n" +
                                "曲名" + ":" + " " + "Infinity Heaven\n" +
                                "EZ定数" + ":" + " " + "3.3\n" +
                                "HD定数" + ":" + " " + "8.4\n" +
                                "IN定数" + ":" + " " + "13.6\n"
                );
                break;
            case 69:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "ChapterEX-WAVEAT 精选集\n" +
                                "加入版本" + ":" + " " + "1.6.7\n" +
                                "曲名" + ":" + " " + "Initialize\n" +
                                "EZ定数" + ":" + " " + "2.5\n" +
                                "HD定数" + ":" + " " + "7.2\n" +
                                "IN定数" + ":" + " " + "11.6\n"
                );
                break;
            case 70:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Chapter5-霓虹灯牌\n" +
                                "加入版本" + ":" + " " + "1.3.0\n" +
                                "曲名" + ":" + " " + "JunXion Between Life And Death(VIP Mix)\n" +
                                "EZ定数" + ":" + " " + "3.2\n" +
                                "HD定数" + ":" + " " + "8.7\n" +
                                "IN定数" + ":" + " " + "13.3\n"
                );
                break;
            case 71:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "2.0.0\n" +
                                "曲名" + ":" + " " + "Kerberos\n" +
                                "EZ定数" + ":" + " " + "5.7\n" +
                                "HD定数" + ":" + " " + "12.4\n" +
                                "IN定数" + ":" + " " + "15.4\n"
                );
                break;
            case 72:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "1.2.3\n" +
                                "曲名" + ":" + " " + "Khronostasis Katharsis\n" +
                                "EZ定数" + ":" + " " + "5.2\n" +
                                "HD定数" + ":" + " " + "10.8\n" +
                                "IN定数" + ":" + " " + "14.2\n"
                );
                break;
            case 73:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Chapter5-霓虹灯牌\n" +
                                "加入版本" + ":" + " " + "1.4.6\n" +
                                "曲名" + ":" + " " + "Leave All Behind\n" +
                                "EZ定数" + ":" + " " + "2.5\n" +
                                "HD定数" + ":" + " " + "6.4\n" +
                                "IN定数" + ":" + " " + "12.7\n"
                );
                break;
            case 74:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "ChapterEX-Rising Sun Traxx 精选集\n" +
                                "加入版本" + ":" + " " + "1.4.0\n" +
                                "曲名" + ":" + " " + "life flashes before weeb eyes\n" +
                                "EZ定数" + ":" + " " + "6.6\n" +
                                "HD定数" + ":" + " " + "11.9\n" +
                                "IN定数" + ":" + " " + "14.8\n"
                );
                break;
            case 75:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "2.1.3\n" +
                                "曲名" + ":" + " " + "Luminescent\n" +
                                "EZ定数" + ":" + " " + "5.9\n" +
                                "HD定数" + ":" + " " + "9.3\n" +
                                "IN定数" + ":" + " " + "14.4\n"
                );
                break;
            case 76:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Side story1-忘忧宫\n" +
                                "加入版本" + ":" + " " + "1.6.0\n" +
                                "曲名" + ":" + " " + "Lyrith -迷宮リリス-\n" +
                                "EZ定数" + ":" + " " + "5.2\n" +
                                "HD定数" + ":" + " " + "11.6\n" +
                                "IN定数" + ":" + " " + "15.9\n" +
                                "AT定数" + ":" + " " + "16.3"
                );
                break;
            case 77:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "1.4.3\n" +
                                "曲名" + ":" + " " + "Magenta Potion\n" +
                                "EZ定数" + ":" + " " + "6.3\n" +
                                "HD定数" + ":" + " " + "11.3\n" +
                                "IN定数" + ":" + " " + "14.5\n"
                );
                break;
            case 78:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "1.0.0\n" +
                                "曲名" + ":" + " " + "MARENOL\n" +
                                "EZ定数" + ":" + " " + "1.9\n" +
                                "HD定数" + ":" + " " + "10.2\n" +
                                "IN定数" + ":" + " " + "14.2\n"
                );
                break;
            case 79:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "ChapterEX-Rising Sun Traxx 精选集\n" +
                                "加入版本" + ":" + " " + "1.4.0\n" +
                                "曲名" + ":" + " " + "mechanted\n" +
                                "EZ定数" + ":" + " " + "2.7\n" +
                                "HD定数" + ":" + " " + "11.3\n" +
                                "IN定数" + ":" + " " + "14.7\n"
                );
                break;
            case 80:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Chapter6-方舟蜃景\n" +
                                "加入版本" + ":" + " " + "1.5.0\n" +
                                "曲名" + ":" + " " + "micro.wav\n" +
                                "EZ定数" + ":" + " " + "6.2\n" +
                                "HD定数" + ":" + " " + "10.7\n" +
                                "IN定数" + ":" + " " + "14.5\n"
                );
                break;
            case 81:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Side story1-忘忧宫\n" +
                                "加入版本" + ":" + " " + "1.6.0\n" +
                                "曲名" + ":" + " " + "Miracle Forest (VIP Mix)\n" +
                                "EZ定数" + ":" + " " + "2.6\n" +
                                "HD定数" + ":" + " " + "9.8\n" +
                                "IN定数" + ":" + " " + "13.7\n"
                );
                break;
            case 82:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Side story1-忘忧宫\n" +
                                "加入版本" + ":" + " " + "1.6.0\n" +
                                "曲名" + ":" + " " + "MOBILYS\n" +
                                "EZ定数" + ":" + " " + "4.8\n" +
                                "HD定数" + ":" + " " + "9.7\n" +
                                "IN定数" + ":" + " " + "14.4\n"
                );
                break;
            case 83:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "1.6.3\n" +
                                "曲名" + ":" + " " + "modulus\n" +
                                "EZ定数" + ":" + " " + "3.7\n" +
                                "HD定数" + ":" + " " + "10.1\n" +
                                "IN定数" + ":" + " " + "14.7\n"
                );
                break;
            case 84:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "1.3.2\n" +
                                "曲名" + ":" + " " + "Next Time\n" +
                                "EZ定数" + ":" + " " + "4.8\n" +
                                "HD定数" + ":" + " " + "9.2\n" +
                                "IN定数" + ":" + " " + "12.6\n"
                );
                break;
            case 85:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "2.0.0\n" +
                                "曲名" + ":" + " " + "Nhelv\n" +
                                "EZ定数" + ":" + " " + "1.7\n" +
                                "HD定数" + ":" + " " + "11.9\n" +
                                "IN定数" + ":" + " " + "15.4\n"
                );
                break;
            case 86:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Chapter7-时钟链接\n" +
                                "加入版本" + ":" + " " + "2.0.0\n" +
                                "曲名" + ":" + " " + "Nick of Time\n" +
                                "EZ定数" + ":" + " " + "4.4\n" +
                                "HD定数" + ":" + " " + "8.1\n" +
                                "IN定数" + ":" + " " + "14.4\n"
                );
                break;
            case 87:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Chapter6-方舟蜃景\n" +
                                "加入版本" + ":" + " " + "1.5.0\n" +
                                "曲名" + ":" + " " + "NO ONE YES MAN\n" +
                                "EZ定数" + ":" + " " + "5.5\n" +
                                "HD定数" + ":" + " " + "11.8\n" +
                                "IN定数" + ":" + " " + "15.4\n"
                );
                break;
            case 88:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Chapter-Legacy\n" +
                                "加入版本" + ":" + " " + "1.0.0\n" +
                                "曲名" + ":" + " " + "Non-Melodic Ragez (MUG Edit)\n" +
                                "EZ定数" + ":" + " " + "5.8\n" +
                                "HD定数" + ":" + " " + "10.5\n" +
                                "IN定数" + ":" + " " + "15.8\n"
                );
                break;
            case 89:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Chapter5-霓虹灯牌\n" +
                                "加入版本" + ":" + " " + "1.3.0\n" +
                                "曲名" + ":" + " " + "NYA!!!\n" +
                                "EZ定数" + ":" + " " + "1.8\n" +
                                "HD定数" + ":" + " " + "8.6\n" +
                                "IN定数" + ":" + " " + "12.9\n"
                );
                break;
            case 90:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "2.2.1\n" +
                                "曲名" + ":" + " " + "opia\n" +
                                "EZ定数" + ":" + " " + "5.4\n" +
                                "HD定数" + ":" + " " + "11.6\n" +
                                "IN定数" + ":" + " " + "15.5\n"
                );
                break;
            case 91:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "1.5.2\n" +
                                "曲名" + ":" + " " + "Orthodox\n" +
                                "EZ定数" + ":" + " " + "4.7\n" +
                                "HD定数" + ":" + " " + "10.6\n" +
                                "IN定数" + ":" + " " + "14.2\n"
                );
                break;
            case 92:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "1.4.5\n" +
                                "曲名" + ":" + " " + "Palescreen\n" +
                                "EZ定数" + ":" + " " + "5.6\n" +
                                "HD定数" + ":" + " " + "11.8\n" +
                                "IN定数" + ":" + " " + "15.7\n"
                );
                break;
            case 93:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "1.5.3\n" +
                                "曲名" + ":" + " " + "Parallel Retrogression(Game Ver.)\n" +
                                "EZ定数" + ":" + " " + "6.8\n" +
                                "HD定数" + ":" + " " + "10.7\n" +
                                "IN定数" + ":" + " " + "14.4\n"
                );
                break;
            case 94:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Chapter-Legacy\n" +
                                "加入版本" + ":" + " " + "1.0.0\n" +
                                "曲名" + ":" + " " + "Pixel Rebelz\n" +
                                "EZ定数" + ":" + " " + "4.5\n" +
                                "HD定数" + ":" + " " + "11.9\n" +
                                "IN定数" + ":" + " " + "15.2\n"
                );
                break;
            case 95:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Side story2- 弭刻日\n" +
                                "加入版本" + ":" + " " + "2.2.0\n" +
                                "曲名" + ":" + " " + "Re_Nascence (Psystyle Ver.)\n" +
                                "EZ定数" + ":" + " " + "4.7\n" +
                                "HD定数" + ":" + " " + "11.4\n" +
                                "IN定数" + ":" + " " + "14.6\n" +
                                "AT定数" + ":" + " " + "16.3"
                );
                break;
            case 96:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Chapter5-霓虹灯牌\n" +
                                "加入版本" + ":" + " " + "1.3.0\n" +
                                "曲名" + ":" + " " + "Reimei\n" +
                                "EZ定数" + ":" + " " + "6.8\n" +
                                "HD定数" + ":" + " " + "11.9\n" +
                                "IN定数" + ":" + " " + "15.1\n"
                );
                break;
            case 97:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "ChapterEX-KALPA 精选集\n" +
                                "加入版本" + ":" + " " + "2.1.0\n" +
                                "曲名" + ":" + " " + "RESSiSTANCE\n" +
                                "EZ定数" + ":" + " " + "6.1\n" +
                                "HD定数" + ":" + " " + "10.6\n" +
                                "IN定数" + ":" + " " + "15.8\n"
                );
                break;
            case 98:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "1.0.0\n" +
                                "曲名" + ":" + " " + "RIPPER\n" +
                                "EZ定数" + ":" + " " + "7.8\n" +
                                "HD定数" + ":" + " " + "11.2\n" +
                                "IN定数" + ":" + " " + "15.2\n"
                );
                break;
            case 99:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Chapter7-时钟链接\n" +
                                "加入版本" + ":" + " " + "2.0.0\n" +
                                "曲名" + ":" + " " + "Rrhar'il\n" +
                                "EZ定数" + ":" + " " + "7.2\n" +
                                "HD定数" + ":" + " " + "12.7\n" +
                                "IN定数" + ":" + " " + "15.7\n" +
                                "AT定数" + ":" + " " + "16.8"
                );
                break;
            case 100:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "1.3.2\n" +
                                "曲名" + ":" + " " + "Rubbish Sorting\n" +
                                "EZ定数" + ":" + " " + "3.3\n" +
                                "HD定数" + ":" + " " + "9.4\n" +
                                "IN定数" + ":" + " " + "12.8\n"
                );
                break;
            case 101:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "1.2.1\n" +
                                "曲名" + ":" + " " + "Sein\n" +
                                "EZ定数" + ":" + " " + "4.6\n" +
                                "HD定数" + ":" + " " + "9.2\n" +
                                "IN定数" + ":" + " " + "14.9\n"
                );
                break;
            case 102:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "1.6.4\n" +
                                "曲名" + ":" + " " + "Shadow\n" +
                                "EZ定数" + ":" + " " + "4.7\n" +
                                "HD定数" + ":" + " " + "10.3\n" +
                                "IN定数" + ":" + " " + "14.5\n"
                );
                break;
            case 103:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "1.5.7\n" +
                                "曲名" + ":" + " " + "SIGMA\n" +
                                "EZ定数" + ":" + " " + "4.8\n" +
                                "HD定数" + ":" + " " + "11.5\n" +
                                "IN定数" + ":" + " " + "15.6\n"
                );
                break;
            case 104:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "1.2.4\n" +
                                "曲名" + ":" + " " + "Snow Desert\n" +
                                "EZ定数" + ":" + " " + "5.1\n" +
                                "HD定数" + ":" + " " + "9.6\n" +
                                "IN定数" + ":" + " " + "13.6\n"
                );
                break;
            case 105:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "1.2.2\n" +
                                "曲名" + ":" + " " + "Sparkle New Life\n" +
                                "EZ定数" + ":" + " " + "4.2\n" +
                                "HD定数" + ":" + " " + "9.2\n" +
                                "IN定数" + ":" + " " + "12.4\n"
                );
                break;
            case 106:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Chapter5-霓虹灯牌\n" +
                                "加入版本" + ":" + " " + "1.3.0\n" +
                                "曲名" + ":" + " " + "Spasmodic\n" +
                                "EZ定数" + ":" + " " + "7.9\n" +
                                "HD定数" + ":" + " " + "12.6\n" +
                                "IN定数" + ":" + " " + "15.2\n" +
                                "AT定数" + ":" + " " + "16.4"
                );
                break;
            case 107:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "1.4.3\n" +
                                "曲名" + ":" + " " + "Speed Up!\n" +
                                "EZ定数" + ":" + " " + "4.3\n" +
                                "HD定数" + ":" + " " + "10.3\n" +
                                "IN定数" + ":" + " " + "14.3\n"
                );
                break;
            case 108:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "1.5.3\n" +
                                "曲名" + ":" + " " + "Starduster\n" +
                                "EZ定数" + ":" + " " + "5.6\n" +
                                "HD定数" + ":" + " " + "11.4\n" +
                                "IN定数" + ":" + " " + "15.1\n"
                );
                break;
            case 109:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Chapter4-管道迷宫\n" +
                                "加入版本" + ":" + " " + "1.1.0\n" +
                                "曲名" + ":" + " " + "Sultan Rage\n" +
                                "EZ定数" + ":" + " " + "3.9\n" +
                                "HD定数" + ":" + " " + "8.5\n" +
                                "IN定数" + ":" + " " + "12.5\n"
                );
                break;
            case 110:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Chapter4-管道迷宫\n" +
                                "加入版本" + ":" + " " + "1.1.0\n" +
                                "曲名" + ":" + " " + "-SURREALISM-\n" +
                                "EZ定数" + ":" + " " + "4.6\n" +
                                "HD定数" + ":" + " " + "7.7\n" +
                                "IN定数" + ":" + " " + "13.4\n"
                );
                break;
            case 111:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "1.5.0\n" +
                                "曲名" + ":" + " " + "The Mountain Eater\n" +
                                "EZ定数" + ":" + " " + "4.3\n" +
                                "HD定数" + ":" + " " + "9.1\n" +
                                "IN定数" + ":" + " " + "14.4\n"
                );
                break;
            case 112:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "ChapterEX-KALPA 精选集\n" +
                                "加入版本" + ":" + " " + "2.1.0\n" +
                                "曲名" + ":" + " " + "Time to Night Sky (feat. Lee Yu Jin)\n" +
                                "EZ定数" + ":" + " " + "2.7\n" +
                                "HD定数" + ":" + " " + "9.1\n" +
                                "IN定数" + ":" + " " + "13.6\n"
                );
                break;
            case 113:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "1.6.2\n" +
                                "曲名" + ":" + " " + "Träne\n" +
                                "EZ定数" + ":" + " " + "1.5\n" +
                                "HD定数" + ":" + " " + "6.7\n" +
                                "IN定数" + ":" + " " + "14.5\n"
                );
                break;
            case 114:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "1.6.9\n" +
                                "曲名" + ":" + " " + "Unorthodox Thoughts\n" +
                                "EZ定数" + ":" + " " + "4.7\n" +
                                "HD定数" + ":" + " " + "11.3\n" +
                                "IN定数" + ":" + " " + "14.4\n"
                );
                break;
            case 115:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "ChapterEX-WAVEAT 精选集\n" +
                                "加入版本" + ":" + " " + "1.6.7\n" +
                                "曲名" + ":" + " " + "volcanic\n" +
                                "EZ定数" + ":" + " " + "7.3\n" +
                                "HD定数" + ":" + " " + "11.9\n" +
                                "IN定数" + ":" + " " + "14.8\n" +
                                "AT定数" + ":" + " " + "16.2"
                );
                break;
            case 116:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Side story1-忘忧宫\n" +
                                "加入版本" + ":" + " " + "1.6.0\n" +
                                "曲名" + ":" + " " + "WATER\n" +
                                "EZ定数" + ":" + " " + "4.5\n" +
                                "HD定数" + ":" + " " + "9.4\n" +
                                "IN定数" + ":" + " " + "13.6\n"
                );
                break;
            case 117:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "1.6.5\n" +
                                "曲名" + ":" + " " + "Wavetapper\n" +
                                "EZ定数" + ":" + " " + "4.4\n" +
                                "HD定数" + ":" + " " + "6.9\n" +
                                "IN定数" + ":" + " " + "13.8\n"
                );
                break;
            case 118:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Chapter-Legacy\n" +
                                "加入版本" + ":" + " " + "1.0.0\n" +
                                "曲名" + ":" + " " + "Winter↑cube↓\n" +
                                "EZ定数" + ":" + " " + "6.7\n" +
                                "HD定数" + ":" + " " + "10.7\n" +
                                "IN定数" + ":" + " " + "13.4\n"
                );
                break;
            case 119:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "1.6.9\n" +
                                "曲名" + ":" + " " + "With You\n" +
                                "EZ定数" + ":" + " " + "3.5\n" +
                                "HD定数" + ":" + " " + "9.3\n" +
                                "IN定数" + ":" + " " + "13.4\n"
                );
                break;
            case 120:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "ChapterEX-Muse Dash 精选集\n" +
                                "加入版本" + ":" + " " + "1.6.8\n" +
                                "曲名" + ":" + " " + "XING\n" +
                                "EZ定数" + ":" + " " + "5.5\n" +
                                "HD定数" + ":" + " " + "9.9\n" +
                                "IN定数" + ":" + " " + "13.8\n"
                );
                break;
            case 121:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "1.6.0\n" +
                                "曲名" + ":" + " " + "ρars/ey\n" +
                                "EZ定数" + ":" + " " + "3.1\n" +
                                "HD定数" + ":" + " " + "8.4\n" +
                                "IN定数" + ":" + " " + "12.8\n"
                );
                break;
            case 122:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "2.1.0\n" +
                                "曲名" + ":" + " " + "もぺもぺ\n" +
                                "EZ定数" + ":" + " " + "3.4\n" +
                                "HD定数" + ":" + " " + "7.2\n" +
                                "IN定数" + ":" + " " + "11.1\n" +
                                "AT定数" + ":" + " " + "14.9"
                );
                break;
            case 123:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "1.0.0\n" +
                                "曲名" + ":" + " " + "ジングルベル(Jingle Bell)\n" +
                                "EZ定数" + ":" + " " + "4.3\n" +
                                "HD定数" + ":" + " " + "8.5\n" +
                                "IN定数" + ":" + " " + "14.5\n"
                );
                break;
            case 124:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Side story1-忘忧宫\n" +
                                "加入版本" + ":" + " " + "2.0.0\n" +
                                "曲名" + ":" + " " + "Ποσειδών\n" +
                                "EZ定数" + ":" + " " + "4.7\n" +
                                "HD定数" + ":" + " " + "11.3\n" +
                                "IN定数" + ":" + " " + "14.7\n"
                );
                break;
            case 125:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "1.6.6\n" +
                                "曲名" + ":" + " " + "大和撫子 -Wild Dances-\n" +
                                "EZ定数" + ":" + " " + "5.7\n" +
                                "HD定数" + ":" + " " + "11.8\n" +
                                "IN定数" + ":" + " " + "14.8\n"
                );
                break;
            case 126:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "1.0.0\n" +
                                "曲名" + ":" + " " + "风屿\n" +
                                "EZ定数" + ":" + " " + "5.9\n" +
                                "HD定数" + ":" + " " + "10.3\n" +
                                "IN定数" + ":" + " " + "13.7\n"
                );
                break;
            case 127:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Chapter-Legacy\n" +
                                "加入版本" + ":" + " " + "1.0.0\n" +
                                "曲名" + ":" + " " + "光\n" +
                                "EZ定数" + ":" + " " + "4.9\n" +
                                "HD定数" + ":" + " " + "8.4\n" +
                                "IN定数" + ":" + " " + "12.8\n"
                );
                break;
            case 128:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "1.2.0\n" +
                                "曲名" + ":" + " " + "華灯爱\n" +
                                "EZ定数" + ":" + " " + "5.5\n" +
                                "HD定数" + ":" + " " + "9.3\n" +
                                "IN定数" + ":" + " " + "14.1\n"
                );
                break;
            case 129:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Chapter-Legacy\n" +
                                "加入版本" + ":" + " " + "1.0.0\n" +
                                "曲名" + ":" + " " + "混乱-Confusion\n" +
                                "EZ定数" + ":" + " " + "5.3\n" +
                                "HD定数" + ":" + " " + "11.4\n" +
                                "IN定数" + ":" + " " + "14.8\n"
                );
                break;
            case 130:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "1.2.0\n" +
                                "曲名" + ":" + " " + "开心病\n" +
                                "EZ定数" + ":" + " " + "3.7\n" +
                                "HD定数" + ":" + " " + "9.8\n" +
                                "IN定数" + ":" + " " + "14.4\n"
                );
                break;
            case 131:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "1.2.1\n" +
                                "曲名" + ":" + " " + "狂喜蘭舞\n" +
                                "EZ定数" + ":" + " " + "6.8\n" +
                                "HD定数" + ":" + " " + "10.8\n" +
                                "IN定数" + ":" + " " + "14.4\n" +
                                "AT定数" + ":" + " " + "16.1"
                );
                break;
            case 132:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "1.0.0\n" +
                                "曲名" + ":" + " " + "万吨匿名信\n" +
                                "EZ定数" + ":" + " " + "5.7\n" +
                                "HD定数" + ":" + " " + "9.7\n" +
                                "IN定数" + ":" + " " + "13.3\n"
                );
                break;
            case 133:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Chapter6-方舟蜃景\n" +
                                "加入版本" + ":" + " " + "1.5.0\n" +
                                "曲名" + ":" + " " + "望影の方舟Six\n" +
                                "EZ定数" + ":" + " " + "6.3\n" +
                                "HD定数" + ":" + " " + "12.9\n" +
                                "IN定数" + ":" + " " + "15.7\n"
                );
                break;
            case 134:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "1.6.2\n" +
                                "曲名" + ":" + " " + "雪降り、メリクリ\n" +
                                "EZ定数" + ":" + " " + "5.6\n" +
                                "HD定数" + ":" + " " + "9.3\n" +
                                "IN定数" + ":" + " " + "15.3\n"
                );
                break;
            case 135:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "ChapterEX-WAVEAT 精选集\n" +
                                "加入版本" + ":" + " " + "1.6.7\n" +
                                "曲名" + ":" + " " + "桜樹街道\n" +
                                "EZ定数" + ":" + " " + "3.6\n" +
                                "HD定数" + ":" + " " + "7.4\n" +
                                "IN定数" + ":" + " " + "12.6\n"
                );
                break;
            case 136:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "1.0.0\n" +
                                "曲名" + ":" + " " + "萤火虫の怨\n" +
                                "EZ定数" + ":" + " " + "4.3\n" +
                                "HD定数" + ":" + " " + "10.6\n" +
                                "IN定数" + ":" + " " + "13.1\n"
                );
                break;
            case 137:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "1.6.10\n" +
                                "曲名" + ":" + " " + "游园地\n" +
                                "EZ定数" + ":" + " " + "2.8\n" +
                                "HD定数" + ":" + " " + "7.7\n" +
                                "IN定数" + ":" + " " + "13.2\n"
                );
                break;
            case 138:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Single-单曲 精选集\n" +
                                "加入版本" + ":" + " " + "1.0.0\n" +
                                "曲名" + ":" + " " + "云女孩\n" +
                                "EZ定数" + ":" + " " + "2.8\n" +
                                "HD定数" + ":" + " " + "9.9\n" +
                                "IN定数" + ":" + " " + "12.6\n"
                );
                break;
            case 139:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Chapter6-方舟蜃景\n" +
                                "加入版本" + ":" + " " + "1.5.0\n" +
                                "曲名" + ":" + " " + "重生\n" +
                                "EZ定数" + ":" + " " + "5.8\n" +
                                "HD定数" + ":" + " " + "9.3\n" +
                                "IN定数" + ":" + " " + "14.6\n"

                );
            case 140:
                user.sendMessage(
                        "\n" + "章节" + ":" + " " + "Chapter5-霓虹灯牌\n" +
                                "加入版本" + ":" + " " + "1.3.0\n" +
                                "曲名" + ":" + " " + "尊師 ～The Guru～\n" +
                                "EZ定数" + ":" + " " + "3.6\n" +
                                "HD定数" + ":" + " " + "9.4\n" +
                                "IN定数" + ":" + " " + "15.2\n");

        }
    }


}
