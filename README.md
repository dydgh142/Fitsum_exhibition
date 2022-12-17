# FitSum
<br>

> 2022 Anyang Univ. Capston Design Contest 🎖️
<br>

'FitSum'은 Tensorflow의 Posenet을 이용하여 사용자의 자세를 인식해 올바른 운동 자세를 갖게 하고, 꾸준한 동기부여 환경을 제공해주는 게임형 운동 어플이다. 

<div align=right> <img src="./images/logo.png" style="width:120px" height="110px"></div>
## PoseNet

- PoseNet은 주요 신체 관절의 위치를 예측하여 이미지 또는 비디오에서 사람의 포즈를 예측하는 데 사용할 수 있는 비전 모델이다.
- PoseNet을 사용하여 사용자의 운동 자세를 인식하고 운동마다 지정된 관절의 각도, 위치를 이용해 올바른 운동습관을 들이도록 한다.
- PoseNet은 동시에 여러사람의 관절을 포착할 수 있기 때문에 운동하는 사용자를 찾아 한 인물의 자세만 예측할 수 있도록 한다.
<br><br><br>

## 개발목표 3가지
- 사용자의 운동을 도와주는 어플이므로 정확한 자세를 수행시 카운트가 되도록 하는 운동 어플을 만든다.
- 집에서 하는 운동이므로 다양한 운동기구가 필요하지 않은 운동을 주가 되도록 한다.
- 사용자의 운동을 지속되게 하도록 동기부여 환경을 다양하게 부여한다.
<br><br><br>

---
## Result

### FirstPage - 로그인, 회원가입
> 어플의 첫 화면과 로그인, 회원가입이 가능한 화면이다. 왼쪽화면의 가운데 이미지는 슬라이드되며 어플에 대한 간단한 소개를 보여준다.
<div align=center> <img src="./images/first.png" style="width:630px" height="400px"></div>

<br>

### Find Password, ID - 아이디찾기, 비밀번호 찾기
> 아이디 찾기와 비밀번호 찾기가 가능하다. 비밀번호찾기는 회원가입시 진행하였던 이메일로 임시 비밀번호를 전송하는 기능을 갖고 있다.
<div align=center> <img src="./images/find.png" style="width:630px" height="400px"></div>

<br>

### MainPage - 메인화면 및 운동화면
> 메인화면에는 자신만의 캐릭터가 있다. 우리 어플의 주 기능중 하나인 캐릭터는 퀘스트를 통해 옷을 바꿀 수 있고, 운동을 통해 자세가 변경되는 모습을 볼 수 있다.
> 현재 운동은 스쿼트와 팔굽혀펴기만 가능하다.
<div align=center> <img src="./images/main.png" style="width:930px" height="400px"></div>

<br>

### QuestPage - 퀘스트화면 
> 어플의 코인을 얻을 수 있는 유일한 페이지로, 출석체크를 통해 얻거나 퀘스트를 통해 코인을 얻을 수 있다.
> 캘린더 화면은 아직 메모 기능만 있지만 추후에는 운동 갯수나 뱃지 활성여부등을 추가할 예정이다.
<div align=center> <img src="./images/quest.png" style="width:380px" height="400px"></div>

<br>


### BoardPage - 게시판화면 
> 게시판 작성을 통하여 다른 유저들과 소통할 수 있는 장소이다. 
<div align=center> <img src="./images/board.png" style="width:380px" height="400px"></div>

<br>

### ProfilePage - 프로필화면 
> 프로필화면에는 닉네임이나 비밀번호를 변경할 수 있고, 로그아웃, 회원탈퇴등이 가능한 곳이다. 
> 가운데에 있는 이미지는 뱃지로 퀘스트와는 또다른 동기부여 시스템으로 특정 요건을 충족 시키면 색깔이 들어가며 활성화 되는 시스템이다.
<div align=center> <img src="./images/profile.png" style="width:200px" height="400px"></div>

<br>

---

### References
- [Tenserflow.Posenet](https://www.tensorflow.org/lite/examples/pose_estimation/overview)

<br><br><br>
**Thank you**

