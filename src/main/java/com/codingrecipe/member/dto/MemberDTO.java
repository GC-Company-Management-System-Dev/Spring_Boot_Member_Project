package com.codingrecipe.member.dto;

import com.codingrecipe.member.entity.MemberEntity;
import lombok.*;

//lombok 라이브러리는 @(어노테이션)만 붙여주면 각각의 필드에 대해 getter, setter 메서드 자동 지원

@Getter
@Setter
@NoArgsConstructor //기본 생성자 자동 생성
@AllArgsConstructor //아래 4가지 필드를 매개변수로 하는 생성자 생성
@ToString //DTO 객제가 가지고 있는 필드값 출력 시 사용되는 tostring 메서드를 자동 생성
public class MemberDTO {
    private Long id;
    private String memberEmail;
    private String memberPassword;
    private String memberName;

    public static MemberDTO toMemberDTO(MemberEntity memberEntity) {
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setId(memberEntity.getId());
        memberDTO.setMemberEmail(memberEntity.getMemberEmail());
        memberDTO.setMemberPassword(memberEntity.getMemberPassword());
        memberDTO.setMemberName(memberEntity.getMemberName());
        return memberDTO;
    }
}
