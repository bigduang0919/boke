$(function(){function e(e){var i=e.data("type"),c=e.parents(".article-item-box").data("articleid");switch(i){case"noTop":comPrompt.show("你确定要取消置顶这篇文章吗？","确定",n,c);break;case"top":comPrompt.show("确定要置顶当前文章？","确定",t,c);break;case"delete":comPrompt.show("确定要删除当前文章？","确定",o,c)}}function t(e){var t={articleId:e};$.post(blog_address+"/phoenix/article/top",t,function(e){e.result?comPrompt.show("文章已置顶！","确定",c,void 0,!1):e.content?alert(e.content):alert("无法置顶，请到后台操作！")})}function n(e){var t={articleId:e};$.post(blog_address+"/phoenix/article/untop",t,function(e){e.result?comPrompt.show("文章已取消置顶！","确定",c,void 0,!1):e.content?alert(e.content):alert("无法取消置顶，请到后台操作！")})}function o(e){var t={articleId:e};$.post(blog_address+"/phoenix/article/delete",t,function(e){e.result?comPrompt.show("文章已删除！","确定",c,void 0,!1):e.content?alert(e.content):alert("无法删除，请到后台删除！")})}if(listTotal>0){var i=new Paging;i.init({target:"#pageBox",pagesize:pageSize,count:listTotal,current:currentPage,firstTpl:"",lastTpl:"",callback:function(e,t,n){var o=getAllUrl(e);location.href=o}}),$(".article-list").find("button.btn-opt").click(function(){e($(this))});var c=function(){location.reload()}}}),function(){var e={fn:"",data:0,show:function(e,o,i,c,r){this.fn=i,this.data=c,r=void 0===r,$(".promptBox .text").html(e),$(".promptBox .clickYes").html(o),$(".mask").fadeIn(300),$(".promptBox").fadeIn(300),$(document).on("click",".clickYes",t),r?($(".clickNo").show(),$(document).on("click",".clickNo",n)):$(".clickNo").hide()},hide:function(){this.fn="",this.can=0,$(".mask").fadeOut(300),$(".promptBox").fadeOut(300),$(".clickYes").unbind("click",t),$(".clickNo").unbind("click",n)}};$(document).on("click",".Boxclose",function(){$(".mask").fadeOut(300),$(".promptBox").fadeOut(300)});var t=function(){e.fn&&e.fn(e.data),e.hide()},n=function(){e.hide()};window.comPrompt=e}(),$(function(){function e(){var e=this;this.keys=[37,38,39,40],this.preventDefault=function(e){e=e||window.event,e.preventDefault&&e.preventDefault(),e.returnValue=!1},this.keydown=function(e){for(var t=this.keys.length;t--;)if(e.keyCode===this.keys[t])return void this.preventDefault(e)},this.wheel=function(t){e.preventDefault(t)},this.disable_scroll=function(){window.addEventListener&&window.addEventListener("DOMMouseScroll",this.wheel,!1),window.onmousewheel=document.onmousewheel=this.wheel,document.onkeydown=this.keydown},this.enable_scroll=function(){window.removeEventListener&&window.removeEventListener("DOMMouseScroll",this.wheel,!1),window.onmousewheel=document.onmousewheel=document.onkeydown=null}}function t(e){$(".newcomer-guide-content .btn").css(n(e.top,e.left)),$(".newcomer-guide-content .text").css(n(e.top-50,e.left)),$(".newcomer-guide-content .close-box").css(n(e.top-100,e.left+320)),$(".newcomer-guide-content .hand").css(n(20,200))}function n(e,t){return{position:"absolute",top:e,left:t}}function o(){return $(".no-data .btn-write-blog").offset()}function i(){return!!localStorage.getItem(currentUserName+"listpage_newcomer_guide")}function c(){localStorage.setItem(currentUserName+"listpage_newcomer_guide",!0)}function r(){$(document).on("click",".newcomer-guide, newcomer-guide .close-box",function(e){c(),$(this).hide(),l.enable_scroll()}).on("click",".btn",function(e){c()})}var l=new e,s=function(){return!i()&&0!==$(".newcomer-guide").length&&(t(o()),l.disable_scroll(!0),$(".newcomer-guide").show(),$(window).resize(function(){t(o())}),void r())};s()});