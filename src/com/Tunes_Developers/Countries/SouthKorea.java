package com.Tunes_Developers.Countries;

/**
 * Created by Geoffrey-Kimani on 10/1/2017.
 */
public class SouthKorea extends Country {
    //Domains
    private String [] freeDomain = {
            "gmail.com", "yahoo.com", "hotmail.com"
    };
    private String [] domains = {
            "biz", "com", "info", "kr", "net", "org",
    };
    //Names
    private String [] firstNameMale = {
            "건우", "건호", "경석", "경수", "경춘", "경환", "광수", "광현", "구범", "규산", "기수", "남수", "남호", "대선", "대수", "도윤",
            "도현", "동윤", "동하", "동현", "명식", "명호", "문용", "문창", "민석", "민성", "민수", "민재", "민준", "민철", "민환", "병철",
            "병호", "상선", "상수", "상우", "상욱", "상준", "상철", "상현", "상호", "상훈", "서준", "서호", "선엽", "성곤", "성령", "성민",
            "성수", "성진", "성현", "성호", "성훈", "수원", "승민", "승현", "승호", "시우", "영길", "영수", "영식", "영일", "영진", "영철",
            "영하", "영호", "영환", "예준", "용태", "용환", "용훈", "우진", "원준", "원진", "원희", "은성", "은택", "인규", "재윤", "재철",
            "재혁", "재현", "재호", "재훈", "정남", "정수", "정식", "정웅", "정호", "정훈", "종수", "종주", "종훈", "주원", "주형", "준",
            "준범", "준서", "준영", "준혁", "준형", "준호", "중수", "지후", "지훈", "진수", "진우", "진호", "창용", "채현", "태현", "태호",
            "혁상", "현규", "현우", "현종", "현준", "형민", "형철", "호민", "호진", "홍선", "효일",
    };
    private String [] firstNameFemale = {
            "가람", "강은", "강희", "경은", "경주", "근영", "기연", "나루", "나리", "나연", "나은", "나형", "누리", "다영", "도연", "동현",
            "미경", "미라", "미란", "미영", "미정", "민서", "민아", "민지", "민형", "민희", "반희", "보람", "보미", "보민", "봄", "상명",
            "새미", "서연", "서영", "서윤", "서현", "선영", "선우", "선정", "선호", "성미", "성민", "성은", "세원", "소민", "소연", "소영",
            "소정", "수란", "수민", "수빈", "수연", "수원", "수정", "수진", "순항", "슬기", "시은", "신애", "아름", "아린", "여진", "연선",
            "연희", "영진", "영화", "예원", "예은", "예지", "예진", "유리", "유정", "유진", "윤경", "윤미", "윤서", "윤영", "은경", "은미",
            "은상", "은서", "은애", "은영", "은정", "은주", "은지", "은진", "은형", "은혜", "은희", "인화", "재연", "정란", "정민", "정은",
            "정화", "주명", "주미", "주연", "주희", "지민", "지선", "지숙", "지아", "지연", "지영", "지예", "지우", "지원", "지은", "지현",
            "지혜", "지희", "진아", "진희", "채원", "태희", "하나", "하윤", "하은", "한나", "헤선", "현영", "현정", "현주", "현지", "혜나",
            "혜림", "혜민", "혜숙", "혜연", "혜진", "효진", "희경", "희원",
    };
    private String [] lastName = {
            "강", "고", "곽", "권", "김", "남", "노", "류", "문", "박", "배", "백", "서", "손", "송", "신", "심", "안", "양", "오",
            "유", "윤", "이", "임", "장", "전", "정", "조", "최", "하", "한", "허", "홍", "황",
    };
    private String [] lastNameAscii = {
            "ahn", "bae", "baek", "chang", "cheon", "cho", "choi", "chung", "gang", "go", "gwak", "gwon", "ha", "han",
            "heo", "hong", "hwang", "jang", "jeon", "jo", "jung", "kang", "kim", "ko", "kwak", "kwon", "lee", "lim", "moon",
            "nam", "no", "oh", "park", "ryu", "seo", "shim", "shin", "son", "song", "yang", "yoon", "yu",
    };
    private String [] firstNameAscii = {
            "areum", "arin", "banhee", "bom", "bomi", "bomin", "boram", "byungcheol", "byungho", "chaehyun", "chaewon",
            "changyoung", "daesoo", "daesun", "dayoung", "dohyunn", "dongha", "donghyun", "donghyun", "dongyoon", "doyoon",
            "doyoun", "eunae", "eunhee", "eunhye", "eunhyoung", "eunji", "eunjin", "eunju", "eunjung", "eunkyoung", "eunmi",
            "eunsang", "eunseo", "eunsung", "eunteck", "eunyoung", "gangeun", "ganghee", "garam", "geongeun", "gunho",
            "gunwoo", "haeun", "hana", "hanna", "hayun", "heekyoung", "heewon", "hojin", "homin", "hongsun", "hyejin",
            "hyemin", "hyena", "hyerim", "hyesuk", "hyesun", "hyeyoun", "hyoil", "hyojin", "hyounjung", "hyuksang",
            "hyungcheol", "hyungmin", "hyunji", "hyunjong", "hyunjoo", "hyunjun", "hyunkyu", "hyunwoo", "hyunyoung",
            "ingyu", "inhwa", "jaecheo", "jaeho", "jaehun", "jaehyuk", "jaehyun", "jaeyeon", "jaeyun", "jia", "jieun",
            "jihee", "jihoo", "jihoon", "jihye", "jihyeon", "jimin", "jina", "jinhee", "jinho", "jinsoo", "jinwoo", "jisuk",
            "jisun", "jiwon", "jiwoo", "jiye", "jiyeon", "jiyoung", "jonghun", "jongju", "jongsoo", "jughyung", "juhee",
            "jumi", "jumyoung", "jun", "junbum", "jungeun", "jungho", "junghun", "junghwa", "jungmin", "jungnam", "jungran",
            "jungshik", "jungsoo", "jungsoo", "jungwoong", "junho", "junhyuk", "junhyung", "junseo", "junyoung", "juwon",
            "juyeon", "kisoo", "kiyun", "kubum", "kwangsoo", "kyungchoon", "kyunghwan", "kyungjoo", "kyungseok", "kyungsoo",
            "kyusan", "mijung", "mikyoung", "mina", "mincheol", "minhee", "minhwan", "minhyoung", "minjae", "minji",
            "minjun", "minseo", "minseok", "minsoo", "minsung", "mira", "miran", "miyoung", "moonchang", "moonyong",
            "myungho", "myungshik", "naeun", "nahyoung", "namho", "namsoo", "naree", "naroo", "nayun", "nuree", "saemi",
            "sangah", "sangcheol", "sangho", "sanghun", "sanghyun", "sangjun", "sangmyoung", "sangsoo", "sangsun",
            "sangwoo", "sangwook", "seoho", "seohyeon", "seojun", "seoyeon", "seoyoung", "seoyun", "seulki", "seungho",
            "seunghyun", "seungmin", "sewon", "sieun", "sinae", "siwoo", "sojung", "somin", "soyoun", "soyoung", "subin",
            "sujin", "sujung", "sumin", "sungeun", "sunggon", "sungho", "sunghun", "sunghyun", "sungjin", "sungmi",
            "sungmin", "sungmin", "sungryung", "sungsoo", "sunhang", "sunho", "sunjung", "sunwoo", "sunyoung", "sunyup",
            "suran", "suwon", "suwon", "suyoun", "taehee", "taeho", "taehyun", "wonhee", "wonjin", "wonjun", "woojin",
            "yeji", "yejin", "yejun", "yeojin", "yeon", "yewon", "youngcheol", "younggil", "youngha", "youngho", "younghun",
            "younghwa", "youngil", "youngjin", "youngjin", "youngshik", "youngsoo", "youngtae", "youngwhan", "youngwhan",
            "younhee", "younsun", "yujin", "yujung", "yunkyoung", "yunmi", "yunseo", "yunyoung", "yuri"
    };
    //Phone Numbers
    private String [] phoneFormats = {
            "010-####-####",
            "070-####-####",
            "02-####-####",
            "03#-####-####",
            "04#-####-####",
            "05#-####-####",
            "06#-####-####",
            "1588-####",
    };
    //Regions
    private String [] county = {
            "경기도", "강원도", "충청북도", "충청남도", "전라북도", "전라남도", "경상북도", "경상남도", "제주특별자치도",
    };
    private String [] city = {
            "파주시", "수원시", "수원시 권선구", "수원시 팔달구", "수원시 영통구", "성남시", "성남시 수정구", "성남시 중원구", "화성시",
            "성남시 분당구", "안양시", "안양시 만안구", "안양시 동안구", "부천시", "부천시 원미구", "부천시 소사구", "부천시 오정구", "광명시",
            "평택시", "이천시", "동두천시", "안산시", "안산시 상록구", "안산시 단원구", "안성시", "고양시", "고양시 덕양구", "고양시 일산동구",
            "고양시 일산서구", "과천시", "구리시", "남양주시", "오산시", "시흥시", "군포시", "의왕시", "하남시", "김포시", "용인시", "용인시 처인구",
            "용인시 기흥구", "용인시 수지구", "연천군", "가평군", "양평군", "광주시", "포천시", "양주시", "수원시 장안구", "의정부시", "여주시",
            "서울특별시", "부산광역시", "대구광역시", "인천광역시", "광주광역시", "대전광역시", "울산광역시",
    };
    private String [] borough ={
            "종로구", "중구", "용산구", "성동구", "광진구", "동대문구", "중랑구", "성북구", "강북구", "도봉구", "노원구", "은평구", "서대문구",
            "마포구", "양천구", "강서구", "구로구", "금천구", "영등포구", "동작구", "관악구", "서초구", "강남구", "송파구", "강동구",
            "동구", "서구", "남구", "북구", "중구",
    };

    public SouthKorea() {
        super();
        super.setDetails(freeDomain, domains, firstNameMale, firstNameFemale, lastName, lastName, phoneFormats,
                county, city);
    }
}
