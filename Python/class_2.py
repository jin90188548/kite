# Student Class 정의
class Student:
    # Contsructor 정의
    def __init__(self, name, kor, math, eng, sci):
        self.name=name
        self.korean=kor
        self.math=math
        self.english=eng
        self.science=sci
    
    # 각 과목의 점수의 합을 구해 반환하는 메서드
    def score_sum(self):
        return self.korean+self.math+self.english+self.science

    # 각 과목의 평균값을 구해 반환하는 메서드 
    def score_avg(self):
        return self.score_sum()/4

# 데이터 저장용 list 선언, 데이터 입력
# Student class 를 이용한 Object 생성
students = [
    Student('Scott', 87, 91, 90, 70),
    Student('KING', 97, 99, 70, 80),
    Student('Adam', 67, 77, 83, 88),
    Student('Smith', 87, 82, 78, 77),
    Student('Son', 77, 90, 69, 90),
    Student('Lee', 83, 69, 100, 60),
    Student('Kim', 80, 77, 60, 100)
    ]

# 학생들의 이름, 총점, 평균
print('이름', '총점', '평균', sep='\t')

# 학생 리스트 반복 출력
for st in students:
    print(st.name, st.score_sum(), st.score_avg(), sep='\t')