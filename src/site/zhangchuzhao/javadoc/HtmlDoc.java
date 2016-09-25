package site.zhangchuzhao.javadoc;

/**
 * Created by Administrator on 2016/9/25.
 */

/** 一个类的注释(包含html标签)
 * <pre>
 *     System.out.println(new Date());
 * </pre>
 */
public class HtmlDoc {
    /**
     * A variable comment
     */
    public int i;
    /**A method comment
     * You can <em>even</em> insert a list;
     * <ol>
     *     <li>one</li>
     *     <li>two</li>
     *     <li>three</li>
     * </ol>
     */
    public void html(){
        System.out.println("java doc");
    }
}
