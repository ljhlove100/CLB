package com.mycompany.myapp.product_comments;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="commentList")
@XmlAccessorType(XmlAccessType.FIELD)
public class CommentListVO {

	@XmlElement(name="comment")
	private List<CommentsVO> commentList;

	//필드값을 읽기위한 get set method생성
	public List<CommentsVO> getCommentList() {
		return commentList;
	}

	public void setCommentList(List<CommentsVO> commentList) {
		this.commentList = commentList;
	}
	
}
