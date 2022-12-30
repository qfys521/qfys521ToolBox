package cn.codethink.qfys521.phigros;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Bean {
    private String 章节;
    private String 加入版本;
    private String 曲名;
    private double EZ定数;
    private int EZ物量;
    private double HD定数;
    private int HD物量;
    private double IN定数;
    private int IN物量;
    private String AT定数;
    private String AT物量;
}
