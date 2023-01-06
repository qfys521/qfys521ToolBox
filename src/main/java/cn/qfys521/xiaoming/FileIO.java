package cn.qfys521.xiaoming;

import cn.chuanwise.xiaoming.annotation.Filter;
import cn.chuanwise.xiaoming.annotation.FilterParameter;
import cn.chuanwise.xiaoming.annotation.Required;
import cn.chuanwise.xiaoming.interactor.SimpleInteractors;
import cn.chuanwise.xiaoming.user.XiaoMingUser;
import cn.qfys521.qfys521UtilPlugin;

import java.io.File;

public class FileIO extends SimpleInteractors<qfys521UtilPlugin> {
    @Filter("FileInformation {path}")
    @Required("qfys521Util.admin.File.Information")
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

    @Filter("Reader {path}")
    @Required("qfys521Util.admin.File.Reader")
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
