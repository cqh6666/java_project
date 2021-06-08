package com.haige.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @className: com.haige.pojo-> Books
 * @description:
 * @author: cqh
 * @createDate: 2021-06-03 21:21
 * @version: 1.0
 * @todo:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {
    private int bookID;
    private String bookName;
    private int bookCounts;
    private String detail;


}
