package life.majiang.community.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ACER on 2019/12/27.
 */
@Data
public class PaginationDTO {
    //分页标志实现
    private List<QuestionDto> questions;
    //是否有向前按钮
    private boolean showPrevious;
    //第一页按钮
    private boolean showFirstPage;
    private boolean showNext;
    private boolean showEndPage;
    private Integer page; //页码
    private List<Integer> pages = new ArrayList<>();
    private Integer totalPage;

    public void setPagination(Integer totalCount, Integer page, Integer size) {
        //可分为多少页
        if (totalCount % size == 0 ){
            totalPage = totalCount /size;
        }else{
            totalPage = totalCount / size + 1;
        }

        if (page < 1){
            page = 1;
        }

        if (page > totalPage){
            page = totalPage;
        }

        this.page = page;

        pages.add(page);
        for (int i=1;i<=3;i++){
            if (page-i>0){
                pages.add(0,page-i);
            }
            if (page +i <= totalPage){
                pages.add(page+i);
            }
        }

        //是否展示上一页
        if (page == 1){
            showPrevious = false;
        }else{
            showPrevious = true;
        }

        //是否展示下一页
        if (page == totalPage){
            showNext = false ;
        }else {
            showNext =true;
        }

        //是否展示第一页
        if (pages.contains(1)){ //是否包含第一页
            showFirstPage = false ;
        }else{
            showFirstPage = true ;
        }

        //是否展示最后一页
        if (pages.contains(totalPage)){
            showEndPage = false ;
        }else{
            showEndPage = true ;
        }
    }
}
