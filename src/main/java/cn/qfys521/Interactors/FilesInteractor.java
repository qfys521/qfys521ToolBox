package cn.qfys521.Interactors;

import cn.chuanwise.xiaoming.annotation.Filter;
import cn.chuanwise.xiaoming.annotation.FilterParameter;
import cn.chuanwise.xiaoming.annotation.Required;
import cn.chuanwise.xiaoming.interactor.SimpleInteractors;
import cn.chuanwise.xiaoming.user.XiaoMingUser;
import cn.qfys521.qfys521ToolBoxPlugin;

import java.io.File;

/**
 * @author qfys521
 */

public class FilesInteractor extends SimpleInteractors<qfys521ToolBoxPlugin> {

    /**
     * 获取文件信息
     *
     * @param user XiaoMingUser 
     * @param path path
     */
    @Filter("FileInformation {path}")
    @Required("qfys521ToolBox.admin.File.Information")
    public void FileInformation(XiaoMingUser user, @FilterParameter("path") String path) {
        try {
            File FileInformation = new File(path);
            try {
                if (FileInformation.exists()) {
                    String FileName = FileInformation.getName();
                    long FileLenght = FileInformation.length();
                    boolean FileHidden = FileInformation.isHidden();
                    if (FileHidden == true) {
                        user.sendMessage("FileName:" + FileName + "\n"
                                + "FileLenght:" + FileLenght + "\n"
                                + "FileInHidden:" + true);
                    } else {
                        user.sendMessage("FileName:" + FileName + "\n"
                                + "FileLenght:" + FileLenght + "\n"
                                + "FileInHidden:" + false);
                    }
                }
            } catch (Exception e) {
                user.sendError("Error:" + e);
            }
        } catch (Exception e) {
            user.sendError("Error:" + e);
        }
    }

    /**
     * 读取文件
     *
     * @param user XiaoMingUser
     * @param path path
     */
    @Filter("Reader {path}")
    @Required("qfys521ToolBox.admin.File.Reader")
    public void FileReader(XiaoMingUser user, @FilterParameter("path") String path) {
        try {
            File FileReader = new File(path);
            try {
                java.io.FileReader Filereader = new java.io.FileReader(FileReader);
                char[] Reader = new char[1024];
                int len = Filereader.read(Reader);
                user.sendMessage("内容为:" + "\n" + new String(Reader, 0, len));
            } catch (Exception e) {
                user.sendError("Error:" + e);
            }
        } catch (Exception e) {
            user.sendError("Error:" + e);
        }
    }


}
