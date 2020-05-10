# 推送方法
总忘...
- echo "# deleteafter" >> README.md
- git init
- git add README.md
- git commit -m "first commit"
- git remote add origin https://github.com/rovesoul/All-about-JAVA.git
- git push -u origin master
- git push -f origin master
# 快捷键:
- commit : command键+ k 后窗口直接点击commit
- push   : command键 + shift + k
> 若遇到问题不能push,报错之类的,项目终端输入:
> git pull origin master --allow-unrelated-histories
> 指令的意思是，允许更新不相关的历史记录，也就是将远程仓库的文件更新过来了，此时便可push到远程了。如果失败，可以依次尝试下面的指令：
> git pull git pull origin master git pull origin master --allow-unrelated-histories
> [参考原文链接](https://blog.csdn.net/weixin_42440596/article/details/105929588)

# 其他内容
书看到面向对象部分