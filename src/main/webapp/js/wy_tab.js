(function($){
	$.fn.tabs=function(method,option){
		if(typeof method=="string"){
			add(option,this);
		}else{
			var $head=$('<ul class="head"></ul>');
			var $content=$('<div class="content"></div>');
			$(this).append($head).append($content);
		}
		function add(option,element){
			var $li=$("<li>"+option.text+"</li>");
			var $frame=$("<div class='frame'><iframe src='"+option.url+"'></iframe></div>");
			$(element).children(".head").append($li);
			$(element).children(".content").append($frame);
		}
	} 
})(jQuery);