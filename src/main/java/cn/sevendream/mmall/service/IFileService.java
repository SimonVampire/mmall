package cn.sevendream.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * 文件上传
 * @author zhangxue
 * @date 2018年10月30日
 */
public interface IFileService {

    String upload(MultipartFile file, String path);
}
