# 데이터 저장용 list 선언, 데이터 입력
# students = [
#     {'name':'Scott', 'korean': 87, 'math': 91, 'english' : 90, 'science': 70 },
#     {'name':'KING', 'korean': 97, 'math': 99, 'english' : 70, 'science': 80 },
#     {'name':'Adam', 'korean': 67, 'math': 77, 'english' : 83, 'science': 88 },
#     {'name':'Smith', 'korean': 87, 'math': 82, 'english' : 78, 'science': 77 },
#     {'name':'Son', 'korean': 77, 'math': 90, 'english' : 69, 'science': 90 },
#     {'name':'Lee', 'korean': 83, 'math': 69, 'english' : 100, 'science': 60 },
#     {'name':'Kim', 'korean': 80, 'math': 77, 'english' : 60, 'science': 100 },
# ]

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


# class 를 이용한 인스턴스 생성
# st_a = Student()
# print(type(st_a))

# st_a.name = 'son' # st_a 객체에 name 속성을 동적 추가
# print(st_a.name)

# st_b = Student()
# print(type(st_b))
# #print(st_b.name)


# 1. list에 추가할 Object 를 만드는 함수
def makeStudent(name, kor, math, eng, sci):
    return {
        'name':name, 
        'korean': kor, 
        'math': math, 
        'english' : eng, 
        'science': sci 
        }


# 2. list에 추가할 Object를 class 를 이용해서 만드는 함수
# def makeStudent_class(name, kor, math, eng, sci):
#     st_temp = Student()
#     st_temp.name = name
#     st_temp.korean = kor
#     st_temp.math = math
#     st_temp.english = eng
#     st_temp.science = sci
#     return st_temp

# students = [
#     makeStudent_class('Scott', 87, 91, 90, 70),
#     makeStudent_class('KING', 97, 99, 70, 80),
#     makeStudent_class('Adam', 67, 77, 83, 88),
#     makeStudent_class('Smith', 87, 82, 78, 77),
#     makeStudent_class('Son', 77, 90, 69, 90),
#     makeStudent_class('Lee', 83, 69, 100, 60),
#     makeStudent_class('Kim', 80, 77, 60, 100)
#     ]

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
#print('이름', '총점', '평균', sep='\t')

# 학생 리스트 반복 출력
for st in students:
    # dic 참조
    #score_sum = st['korean']+st['english']+st['math']+st['science']

    # class instance 속성 참조
    #score_sum = st.korean + st.english + st.math + st.science
    #score_avg = score_sum/4
    #print(st['name'], score_sum, score_avg, sep='\t')
    # class instance 속성 참조
    #print(st.name, score_sum, score_avg, sep='\t')
    print(st.name, st.score_sum(), st.score_avg(), sep='\t')