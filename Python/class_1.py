# 데이터 저장용 list 선언, 데이터 입력
students = [
    {'name':'Scott', 'korean': 87, 'math': 91, 'english' : 90, 'science': 70 },
    {'name':'KING', 'korean': 97, 'math': 99, 'english' : 70, 'science': 80 },
    {'name':'Adam', 'korean': 67, 'math': 77, 'english' : 83, 'science': 88 },
    {'name':'Smith', 'korean': 87, 'math': 82, 'english' : 78, 'science': 77 },
    {'name':'Son', 'korean': 77, 'math': 90, 'english' : 69, 'science': 90 },
    {'name':'Lee', 'korean': 83, 'math': 69, 'english' : 100, 'science': 60 },
    {'name':'Kim', 'korean': 80, 'math': 77, 'english' : 60, 'science': 100 },
]

# 학생들의 이름, 총점, 평균
print('이름', '총점', '평균', sep='\t')

# 학생 리스트 반복 출력
for st in students:
    score_sum = st['korean']+st['english']+st['math']+st['science']
    score_avg = score_sum//4
    print(st['name'], score_sum, score_avg, sep='\t')