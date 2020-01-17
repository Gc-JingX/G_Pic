package com.lzy.imagepicker.bean;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * ================================================
 * 作    者：jeasonlzy（廖子尧 Github地址：https://github.com/jeasonlzy0216
 * 版    本：1.0
 * 创建日期：2016/5/19
 * 描    述：图片文件夹
 * 修订历史：
 * ================================================
 */
public class ImageFolder implements Serializable {

    private String name;  //当前文件夹的名字
    private String path;  //当前文件夹的路径
    private ImageItem cover;   //当前文件夹需要要显示的缩略图，默认为最近的一次图片
    private ArrayList<ImageItem> images;  //当前文件夹下所有图片的集合

    public String getName() {
        return name == null ? "" : name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path == null ? "" : path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ImageItem getCover() {
        return cover;
    }

    public void setCover(ImageItem cover) {
        this.cover = cover;
    }

    public ArrayList<ImageItem> getImages() {
        if (images == null) {
            return new ArrayList<>();
        }
        return images;
    }

    public void setImages(ArrayList<ImageItem> images) {
        this.images = images;
    }

    /**
     * 只要文件夹的路径和名字相同，就认为是相同的文件夹
     */
    @Override
    public boolean equals(Object o) {
        if (o == null)
            return false;

        if (this.getClass() != o.getClass())
            return false;
        try {
            if (o != null) {
                ImageFolder other = (ImageFolder) o;
                return this.path.equalsIgnoreCase(other.path) && this.name.equalsIgnoreCase(other.name);

            }
            return super.equals(o);
        } catch (ClassCastException e) {

        }
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
